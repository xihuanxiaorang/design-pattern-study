package top.xiaorang.design.pattern.state;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">播放中状态<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 8:11
 */
public class PlayingState extends State {
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String play() {
        player.setState(new ReadyState(player));
        return "Paused...";
    }

    @Override
    public String stop() {
        player.setState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop Playing...";
    }

    @Override
    public String next() {
        return player.nextTrack();
    }

    @Override
    public String prev() {
        return player.prevTrack();
    }
}
