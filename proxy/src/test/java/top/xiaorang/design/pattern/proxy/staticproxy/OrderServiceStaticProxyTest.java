package top.xiaorang.design.pattern.proxy.staticproxy;

import org.junit.Test;
import top.xiaorang.design.pattern.proxy.basic.Order;
import top.xiaorang.design.pattern.proxy.basic.OrderServiceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liulei
 * @description 订单业务层静态代理测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/21 22:58
 */
public class OrderServiceStaticProxyTest {
    @Test
    public void test() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = simpleDateFormat.parse("2022/08/21");
            Order order = new Order();
            order.setCreateTime(date.getTime());

            OrderServiceStaticProxy proxy = new OrderServiceStaticProxy(new OrderServiceImpl());
            proxy.createOrder(order);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}