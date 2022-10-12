package top.xiaorang.design.pattern.state;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">锁定状态<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 8:12
 */
public class LockedState extends State {
    public LockedState(Player player) {
        super(player);
    }

    @Override
    public String play() {
        player.setState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String stop() {
        if (player.isPlaying()) {
            player.setState(new ReadyState(player));
            return "Stop Playing...";
        }
        return "Locked...";
    }

    @Override
    public String next() {
        return "Locked...";
    }

    @Override
    public String prev() {
        return "Locked...";
    }
}
