package top.xiaorang.design.pattern.singleton;

import org.junit.Test;

/**
 * @author liulei
 * @description ThreadLocal单例模式测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/20 23:05
 */
public class ThreadLocalSingletonTest {
    @Test
    public void test() {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Runnable runnable = () -> {
            ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        System.out.println("开始执行...");
    }
}