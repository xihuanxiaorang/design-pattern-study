package top.xiaorang.design.pattern.proxy.general;

/**
 * @author liulei
 * @description 客户端
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/21 21:17
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
