package top.xiaorang.design.pattern.singleton;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author liulei
 * @description 静态内部类单例模式测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/20 20:10
 */
public class LazyStaticInnerSingletonTest {
    @Test
    public void test() {
        Runnable runnable = () -> {
            LazyStaticInnerSingleton instance = LazyStaticInnerSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance);
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        System.out.println("开始执行...");
    }

    @Test
    public void test1() {
        // 测试反射破坏单例
        Class<LazyStaticInnerSingleton> clazz = LazyStaticInnerSingleton.class;
        try {
            // 通过反射的方式获取私有的构造方法
            Constructor<LazyStaticInnerSingleton> constructor = clazz.getDeclaredConstructor();
            // 强制访问
            constructor.setAccessible(true);
            // 暴力初始化
            LazyStaticInnerSingleton o1 = constructor.newInstance();
            System.out.println(o1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test2() {
        LazyStaticInnerSingleton s1 = null;
        LazyStaticInnerSingleton s2 = LazyStaticInnerSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("LazyStaticInnerSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("LazyStaticInnerSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (LazyStaticInnerSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}