package top.xiaorang.design.pattern.singleton;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author liulei
 * @description 枚举式单例模式测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/20 22:05
 */
public class EnumSingletonTest {
    @Test
    public void test() {
        try {
            EnumSingleton s1 = null;
            EnumSingleton s2 = EnumSingleton.getInstance();
            s2.setData(new Object());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1.getData() == s2.getData());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test1() {
        try {
            Class<EnumSingleton> clazz = EnumSingleton.class;
            Constructor<EnumSingleton> constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            EnumSingleton enumSingleton = constructor.newInstance("xiaorang", 666);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}