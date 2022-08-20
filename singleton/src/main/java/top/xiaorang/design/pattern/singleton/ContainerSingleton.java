package top.xiaorang.design.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liulei
 * @description 容器式单例模式
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/20 22:41
 */
public class ContainerSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    Class<?> clazz = Class.forName(className);
                    obj = clazz.newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                return obj;
            }
            return ioc.get(className);
        }
    }
}

class A {

}
