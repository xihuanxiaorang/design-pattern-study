package top.xiaorang.design.pattern.publishersubscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">收到通知后在日志中记录一条消息<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 3:46
 */
public class LogOpenListener implements EventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogOpenListener.class);
    private final File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(EventType eventType, File file) {
        LOGGER.debug("Save to log {}: Someone has performed {} operation with the following file: {}", log, eventType, file.getName());
    }
}
