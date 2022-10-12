package top.xiaorang.design.pattern.state.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;
import org.springframework.stereotype.Component;
import top.xiaorang.design.pattern.state.entity.Order;
import top.xiaorang.design.pattern.state.enums.OrderEvent;
import top.xiaorang.design.pattern.state.enums.OrderStatus;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/13 2:00
 */
@Component
@WithStateMachine(name = "orderStateMachine")
public class OrderStateListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderStateListener.class);

    @OnTransition(source = "WAIT_PAYMENT", target = "WAIT_DELIVER")
    public boolean payTransition(Message<OrderEvent> message) {
        Order order = (Order) message.getHeaders().get("order");
        assert order != null;
        order.setStatus(OrderStatus.WAIT_DELIVER);
        LOGGER.debug("支付 {}", order);
        return true;
    }

    @OnTransition(source = "WAIT_DELIVER", target = "WAIT_RECEIVE")
    public boolean deliverTransition(Message<OrderEvent> message) {
        Order order = (Order) message.getHeaders().get("order");
        assert order != null;
        order.setStatus(OrderStatus.WAIT_RECEIVE);
        LOGGER.debug("发货 {}", order);
        return true;
    }

    @OnTransition(source = "WAIT_RECEIVE", target = "FINISH")
    public boolean receiveTransition(Message<OrderEvent> message) {
        Order order = (Order) message.getHeaders().get("order");
        assert order != null;
        order.setStatus(OrderStatus.FINISH);
        LOGGER.debug("收货 {}", order);
        return true;
    }
}
