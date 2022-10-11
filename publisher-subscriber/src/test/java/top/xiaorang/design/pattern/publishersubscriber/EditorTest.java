package top.xiaorang.design.pattern.publishersubscriber;

import org.junit.Test;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">编辑器测试类<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 3:51
 */
public class EditorTest {
    @Test
    public void test() {
        EventManager eventManager = new EventManager();
        eventManager.subscribe(EventType.OPEN, new LogOpenListener("/path/to/log/file.txt"));
        eventManager.subscribe(EventType.SAVE, new EmailNotificationListener("15019474951@163.com"));

        Editor editor = new Editor(eventManager);
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}