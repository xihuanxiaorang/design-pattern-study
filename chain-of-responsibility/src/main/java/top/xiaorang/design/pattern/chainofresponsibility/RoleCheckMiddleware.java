package top.xiaorang.design.pattern.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">检查用户角色<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/17 6:11
 */
public class RoleCheckMiddleware extends Middleware {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleCheckMiddleware.class);

    @Override
    protected boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            LOGGER.debug("Hello admin!");
            return true;
        }
        LOGGER.debug("Hello user!");
        return checkNext(email, password);
    }
}
