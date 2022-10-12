package top.xiaorang.design.pattern.state;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.xiaorang.design.pattern.state.service.OrderService;

@SpringBootTest
class State01ApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(State01ApplicationTests.class);
    @Autowired
    private OrderService orderService;

    @Test
    void test() throws InterruptedException {
        orderService.creat();
        orderService.creat();

        orderService.pay(1);

        Thread t1 = new Thread(() -> {
            orderService.deliver(1);
            orderService.receive(1);
        }, "t1");
        t1.start();

        orderService.pay(2);
        orderService.deliver(2);
        orderService.receive(2);
        t1.join();
        LOGGER.debug("{}", orderService.getAllOrders());
    }
}
