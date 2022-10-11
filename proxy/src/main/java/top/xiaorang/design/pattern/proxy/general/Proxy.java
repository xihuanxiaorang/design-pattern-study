package top.xiaorang.design.pattern.proxy.general;

/**
 * @author liulei
 * @description
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/21 21:14
 */
public class Proxy implements Subject {
    private final Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void after() {
        System.out.println("请求执行之后的操作");
    }

    private void before() {
        System.out.println("请求执行之前的操作");
    }
}
