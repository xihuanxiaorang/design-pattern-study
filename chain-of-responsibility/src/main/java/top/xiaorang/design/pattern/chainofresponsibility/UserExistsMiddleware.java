package top.xiaorang.design.pattern.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">检查用户登录信息<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/17 6:01
 */
public class UserExistsMiddleware extends Middleware {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserExistsMiddleware.class);

    private final Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    protected boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            LOGGER.debug("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            LOGGER.debug("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}
