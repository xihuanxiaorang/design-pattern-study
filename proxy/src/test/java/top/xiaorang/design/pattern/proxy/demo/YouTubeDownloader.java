package top.xiaorang.design.pattern.proxy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">媒体下载应用<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/10 4:01
 */
public class YouTubeDownloader {
    private static final Logger LOGGER = LoggerFactory.getLogger(YouTubeDownloader.class);

    private final ThirdPartyYoutubeLib api;

    public YouTubeDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        LOGGER.debug("-------------------------------");
        LOGGER.debug("Video page (imagine fancy HTML)");
        LOGGER.debug("ID: {}", video.getId());
        LOGGER.debug("Title: {}", video.getTitle());
        LOGGER.debug("Video: {}", video.getData());
        LOGGER.debug("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        LOGGER.debug("-------------------------------");
        LOGGER.debug("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            LOGGER.debug("ID: {} / Title: {}", video.getId(), video.getTitle());
        }
        LOGGER.debug("-------------------------------\n");
    }
}
