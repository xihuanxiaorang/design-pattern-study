package top.xiaorang.design.pattern.singleton;

import org.junit.Test;

/**
 * @author liulei
 * @description 懒汉式单例模式（线程不安全）测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/19 17:40
 */
public class LazySimpleSingletonTest {
    @Test
    public void test() {
        Runnable runnable = () -> {
            LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance);
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        System.out.println("开始执行...");
    }
}