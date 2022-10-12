package top.xiaorang.design.pattern.state.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.persist.StateMachinePersister;
import org.springframework.stereotype.Service;
import top.xiaorang.design.pattern.state.entity.Order;
import top.xiaorang.design.pattern.state.enums.OrderEvent;
import top.xiaorang.design.pattern.state.enums.OrderStatus;
import top.xiaorang.design.pattern.state.repository.OrderRepository;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">订单服务实现类<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/13 2:12
 */
@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);
    private final StateMachine<OrderStatus, OrderEvent> orderStateMachine;
    private final StateMachinePersister<OrderStatus, OrderEvent, Order> orderStateMachinePersister;
    private final OrderRepository orderRepository;
    private Integer orderId = 1;

    public OrderServiceImpl(StateMachine<OrderStatus, OrderEvent> orderStateMachine, StateMachinePersister<OrderStatus, OrderEvent, Order> orderStateMachinePersister, OrderRepository orderRepository) {
        this.orderStateMachine = orderStateMachine;
        this.orderStateMachinePersister = orderStateMachinePersister;
        this.orderRepository = orderRepository;
    }

    @Override
    public Order creat() {
        Integer orderId = generateOrderId();
        Order order = Order.builder().id(orderId).status(OrderStatus.WAIT_PAYMENT).build();
        return orderRepository.save(orderId, order);
    }

    @Override
    public Order pay(Integer id) {
        Order order = orderRepository.get(id);
        if (order != null) {
            LOGGER.debug("尝试支付订单{}", order);
            Message<OrderEvent> message = MessageBuilder.withPayload(OrderEvent.PAYED).setHeader("order", order).build();
            if (!sendEvent(message, order)) {
                LOGGER.debug("订单{}支付失败，状态异常！", order);
            }
        }
        return order;
    }

    @Override
    public Order deliver(Integer id) {
        Order order = orderRepository.get(id);
        if (order != null) {
            LOGGER.debug("尝试发货{}", order);
            Message<OrderEvent> message = MessageBuilder.withPayload(OrderEvent.DELIVERY).setHeader("order", order).build();
            if (!sendEvent(message, order)) {
                LOGGER.debug("尝试发货{}失败，状态异常！", order);
            }
        }
        return order;
    }

    @Override
    public Order receive(Integer id) {
        Order order = orderRepository.get(id);
        if (order != null) {
            LOGGER.debug("尝试收货{}", order);
            Message<OrderEvent> message = MessageBuilder.withPayload(OrderEvent.RECEIVED).setHeader("order", order).build();
            if (!sendEvent(message, order)) {
                LOGGER.debug("尝试收货{}失败，状态异常！", order);
            }
        }
        return order;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    private synchronized boolean sendEvent(Message<OrderEvent> message, Order order) {
        boolean result = false;
        try {
            orderStateMachine.start();
            orderStateMachinePersister.restore(orderStateMachine, order);
            TimeUnit.SECONDS.sleep(1);
            result = orderStateMachine.sendEvent(message);
            orderStateMachinePersister.persist(orderStateMachine, order);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            orderStateMachine.stop();
        }
        return result;
    }

    private Integer generateOrderId() {
        return orderId++;
    }
}
