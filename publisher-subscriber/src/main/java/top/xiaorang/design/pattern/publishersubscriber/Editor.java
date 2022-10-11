package top.xiaorang.design.pattern.publishersubscriber;

import java.io.File;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">具体发布者<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 3:40
 */
public class Editor {
    private final EventManager eventManager;
    private File file;

    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify(EventType.OPEN, this.file);
    }

    public void saveFile() throws Exception {
        if (this.file == null) {
            throw new Exception("Please open a file first");
        }
        eventManager.notify(EventType.SAVE, this.file);
    }
}
