package top.xiaorang.design.pattern.proxy.basic;

/**
 * @author liulei
 * @description 数据源路由
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/21 22:47
 */
public class DynamicDataSourceEntry {
    private static final ThreadLocal<String> local = new ThreadLocal<>();

    private DynamicDataSourceEntry() {
    }

    /**
     * 清空数据源
     */
    public static void clear() {
        local.remove();
    }

    /**
     * 获取当前正在使用的数据源名称
     *
     * @return 数据源名称
     */
    public static String get() {
        return local.get();
    }

    /**
     * 设置已知名字的数据源
     *
     * @param source 数据源名称
     */
    public static void set(String source) {
        local.set(source);
    }

    /**
     * 根据年份动态设置数据源
     *
     * @param year 年份
     */
    public static void set(int year) {
        local.set("DB_" + year);
    }
}
