package top.xiaorang.design.pattern.proxy.staticproxy;

import lombok.extern.slf4j.Slf4j;
import top.xiaorang.design.pattern.proxy.basic.DynamicDataSourceEntry;
import top.xiaorang.design.pattern.proxy.basic.Order;
import top.xiaorang.design.pattern.proxy.basic.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liulei
 * @description 订单业务层代静态代理类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/21 22:52
 */
@Slf4j
public class OrderServiceStaticProxy implements OrderService {
    private static final SimpleDateFormat yearFormatter = new SimpleDateFormat("yyyy");
    private final OrderService orderService;

    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long createTime = order.getCreateTime();
        int dbRouter = Integer.parseInt(yearFormatter.format(new Date(createTime)));
        log.info("静态代理类自动分配到【DB_{}】数据源处理数据", dbRouter);
        DynamicDataSourceEntry.set(dbRouter);
        int res = orderService.createOrder(order);
        after();
        return res;
    }

    @Override
    public Long getCreateTime(Order order) {
        return order.getCreateTime();
    }

    private void after() {
        log.info("Proxy after method.");
    }

    private void before() {
        log.info("Proxy before method.");
    }
}
