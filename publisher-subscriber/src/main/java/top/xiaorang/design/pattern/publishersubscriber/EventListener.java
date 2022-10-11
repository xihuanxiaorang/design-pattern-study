package top.xiaorang.design.pattern.publishersubscriber;

import java.io.File;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">通用监听器接口<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 3:29
 */
public interface EventListener {
    void update(EventType eventType, File file);
}
