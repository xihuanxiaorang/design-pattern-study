package top.xiaorang.design.pattern.state;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">播放器<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 7:54
 */
public class Player {
    private final List<String> playList = new ArrayList<>();
    private int currentTrack = 0;
    private State state;
    private boolean playing = false;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);
        for (int i = 1; i <= 12; i++) {
            playList.add("Track " + i);
        }
    }

    public String startPlayback() {
        return "Playing " + playList.get(this.currentTrack);
    }

    public String nextTrack() {
        this.currentTrack++;
        if (this.currentTrack > playList.size() - 1) {
            this.currentTrack = 0;
        }
        return "Playing " + playList.get(this.currentTrack);
    }

    public String prevTrack() {
        this.currentTrack--;
        if (this.currentTrack < 0) {
            this.currentTrack = playList.size() - 1;
        }
        return "Playing " + playList.get(this.currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}
