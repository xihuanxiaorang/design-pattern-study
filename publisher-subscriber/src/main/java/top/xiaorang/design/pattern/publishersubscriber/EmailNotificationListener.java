package top.xiaorang.design.pattern.publishersubscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">收到通知后发送邮件<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 3:49
 */
public class EmailNotificationListener implements EventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailNotificationListener.class);
    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType, File file) {
        LOGGER.debug("Email to {}: Someone has performed {} operation with the following file: {}", email, eventType, file.getName());
    }
}
