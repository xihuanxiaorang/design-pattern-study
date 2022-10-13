package top.xiaorang.design.pattern.state;

/**
 * @author liulei
 * @description 测试<p style = " font-weight:bold ; ">播放器功能<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 8:28
 */
public class ApiTest {
    public static void main(String[] args) {
        UI ui = new UI(new Player());
        ui.init();
    }
}