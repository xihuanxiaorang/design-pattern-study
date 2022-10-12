package top.xiaorang.design.pattern.state;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">通用状态抽象类<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 7:53
 */
public abstract class State {
    protected final Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String play();

    public abstract String stop();

    public abstract String next();

    public abstract String prev();
}
