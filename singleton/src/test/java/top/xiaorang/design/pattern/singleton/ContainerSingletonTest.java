package top.xiaorang.design.pattern.singleton;

import org.junit.Test;

/**
 * @author liulei
 * @description 容器式单例模式测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/20 22:45
 */
public class ContainerSingletonTest {
    @Test
    public void test() {
        Runnable runnable = () -> {
            A bean = (A) ContainerSingleton.getBean("top.xiaorang.design.pattern.singleton.A");
            System.out.println(bean);
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        System.out.println("开始执行...");
    }
}