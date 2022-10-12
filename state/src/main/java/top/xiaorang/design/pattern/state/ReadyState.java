package top.xiaorang.design.pattern.state;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">就绪状态<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 8:07
 */
public class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String play() {
        String action = player.startPlayback();
        player.setState(new PlayingState(player));
        return action;
    }

    @Override
    public String stop() {
        player.setState(new LockedState(player));
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
