package top.xiaorang.design.pattern.singleton;

/**
 * @author liulei
 * @description 枚举式单例模式
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/20 22:04
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
