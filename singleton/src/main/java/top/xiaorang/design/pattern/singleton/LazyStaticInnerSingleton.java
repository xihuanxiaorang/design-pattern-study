package top.xiaorang.design.pattern.singleton;

import java.io.Serializable;

/**
 * @author liulei
 * @description 静态内部类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/20 20:07
 */
public class LazyStaticInnerSingleton implements Serializable {
    private LazyStaticInnerSingleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("无效访问，无权访问构造方法");
        }
    }

    // static 关键字是为了使单例的空间共享，保证这个方法不会被重写、重载
    public static LazyStaticInnerSingleton getInstance() {
        // 在结果返回之前，一定会先加载内部类
        return LazyHolder.INSTANCE;
    }

    private Object readResolve() {
        return LazyHolder.INSTANCE;
    }

    // 默认不加载
    private static class LazyHolder {
        private static final LazyStaticInnerSingleton INSTANCE = new LazyStaticInnerSingleton();
    }
}