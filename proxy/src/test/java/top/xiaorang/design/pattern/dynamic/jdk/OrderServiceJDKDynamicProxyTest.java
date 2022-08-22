package top.xiaorang.design.pattern.dynamic.jdk;

import lombok.extern.slf4j.Slf4j;
import top.xiaorang.design.pattern.proxy.basic.DynamicDataSourceEntry;
import top.xiaorang.design.pattern.proxy.basic.Order;
import top.xiaorang.design.pattern.proxy.basic.OrderService;
import top.xiaorang.design.pattern.proxy.basic.OrderServiceImpl;

import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liulei
 * @description 订单业务层代JDK动态代理测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/22 0:16
 */
@Slf4j
public class OrderServiceJDKDynamicProxyTest {
    private static final SimpleDateFormat YYYY = new SimpleDateFormat("yyyy");
    private static final SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy/MM/dd");

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        try {
            Date date = YYYY_MM_DD.parse("2019/08/21");
            Order order = new Order();
            order.setCreateTime(date.getTime());

            OrderService orderService = new OrderServiceImpl();
            Class<?> clazz = orderService.getClass();

            OrderService proxy = (OrderService) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (proxy1, method, args1) -> {
                try {
                    before();
                    Long createTime = (Long) clazz.getMethod("getCreateTime", Order.class).invoke(orderService, order);
                    int dbRouter = Integer.parseInt(YYYY.format(new Date(createTime)));
                    log.info("JDK动态代理类自动分配到【DB_{}】数据源处理数据", dbRouter);
                    DynamicDataSourceEntry.set(dbRouter);
                    Object res = method.invoke(orderService, args1);
                    after();
                    return res;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            });
            proxy.createOrder(order);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void after() {
        log.info("Proxy after method.");
    }

    private static void before() {
        log.info("Proxy before method.");
    }
}