package top.xiaorang.design.pattern.singleton;

import org.junit.Test;

/**
 * @author liulei
 * @description 饿汉式单例模式测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/19 17:35
 */
public class HungrySingletonTest {
    @Test
    public void test() {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1);
        System.out.println(hungrySingleton2);
    }
}