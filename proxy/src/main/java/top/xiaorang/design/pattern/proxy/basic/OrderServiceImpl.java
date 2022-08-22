package top.xiaorang.design.pattern.proxy.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 订单业务层接口实现类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/21 22:45
 */
@Slf4j
public class OrderServiceImpl implements OrderService {
    private final OrderDao orderDao = new OrderDao();

    @Override
    public int createOrder(Order order) {
        log.info("OrderService 调用 orderDao 创建订单");
        return orderDao.insert(order);
    }

    @Override
    public Long getCreateTime(Order order) {
        return order.getCreateTime();
    }
}
