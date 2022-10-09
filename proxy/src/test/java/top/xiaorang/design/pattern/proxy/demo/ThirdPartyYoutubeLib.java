package top.xiaorang.design.pattern.proxy.demo;

import java.util.HashMap;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">远程服务接口<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/10 3:36
 */
public interface ThirdPartyYoutubeLib {
    /**
     * 加载热门视频
     *
     * @return 热门视频
     */
    HashMap<String, Video> popularVideos();

    /**
     * 根据视频id加载视频
     *
     * @param videoId 视频id
     * @return 视频
     */
    Video getVideo(String videoId);
}
