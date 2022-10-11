package top.xiaorang.design.pattern.singleton;

/**
 * @author liulei
 * @description 懒汉式（线程不安全）
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/19 17:37
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
