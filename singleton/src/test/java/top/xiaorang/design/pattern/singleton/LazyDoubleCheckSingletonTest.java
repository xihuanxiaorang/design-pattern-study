package top.xiaorang.design.pattern.singleton;

import org.junit.Test;

/**
 * @author liulei
 * @description 双重检查锁单例模式测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/20 20:11
 */
public class LazyDoubleCheckSingletonTest {
    @Test
    public void test() {
        Runnable runnable = () -> {
            LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance);
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        System.out.println("开始执行...");
    }
}