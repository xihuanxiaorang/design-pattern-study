package top.xiaorang.design.pattern.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.xiaorang.design.pattern.chainofresponsibility.Middleware.Builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/17 6:12
 */
public class ApiTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiTest.class);
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same components.
        Middleware middleware = new Builder().addMiddleware(new ThrottlingMiddleware(2))
                .addMiddleware(new UserExistsMiddleware(server))
                .addMiddleware(new RoleCheckMiddleware()).build();
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            LOGGER.debug("Enter email：");
            String email = reader.readLine();
            LOGGER.debug("Enter password：");
            String password = reader.readLine();
            success = server.login(email, password);
        } while (!success);
    }
}
