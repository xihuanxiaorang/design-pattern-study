package top.xiaorang.design.pattern.dynamic.cglib;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import top.xiaorang.design.pattern.proxy.basic.DynamicDataSourceEntry;
import top.xiaorang.design.pattern.proxy.basic.Order;
import top.xiaorang.design.pattern.proxy.basic.OrderService;
import top.xiaorang.design.pattern.proxy.basic.OrderServiceImpl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import static net.sf.cglib.core.DebuggingClassWriter.DEBUG_LOCATION_PROPERTY;

/**
 * @author liulei
 * @description 订单业务层代Cglib动态代理测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/22 7:53
 */
@Slf4j
public class OrderServiceCglibDynamicProxyTest {
    private static final SimpleDateFormat YYYY = new SimpleDateFormat("yyyy");
    private static final SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy/MM/dd");

    public static void main(String[] args) {
        System.setProperty(DEBUG_LOCATION_PROPERTY, new File("").getAbsolutePath() + "/cglib");
        try {
            Date date = YYYY_MM_DD.parse("2019/08/21");
            Order order = new Order();
            order.setCreateTime(date.getTime());

            OrderService orderService = new OrderServiceImpl();
            Class<?> clazz = orderService.getClass();

            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(clazz);
            enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
                try {
                    before();
                    Long createTime = (Long) clazz.getMethod("getCreateTime", Order.class).invoke(orderService, order);
                    int dbRouter = Integer.parseInt(YYYY.format(new Date(createTime)));
                    log.info("Cglib动态代理类自动分配到【DB_{}】数据源处理数据", dbRouter);
                    DynamicDataSourceEntry.set(dbRouter);
                    Object res = methodProxy.invokeSuper(o, objects);
                    after();
                    return res;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            });
            OrderService proxy = (OrderService) enhancer.create();
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