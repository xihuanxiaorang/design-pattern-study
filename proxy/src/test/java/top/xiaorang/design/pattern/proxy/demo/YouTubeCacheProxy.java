package top.xiaorang.design.pattern.proxy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">视频加载缓存代理<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/10 3:54
 */
public class YouTubeCacheProxy implements ThirdPartyYoutubeLib {
    private static final Logger LOGGER = LoggerFactory.getLogger(YouTubeCacheProxy.class);
    private final HashMap<String, Video> cachePopular = new HashMap<>();
    private final HashMap<String, Video> cacheAll = new HashMap<>();

    private final ThirdPartyYoutubeLib youtubeService;

    public YouTubeCacheProxy(ThirdPartyYoutubeLib youtubeService) {
        this.youtubeService = youtubeService;
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular.putAll(youtubeService.popularVideos());
        } else {
            LOGGER.debug("Retrieved list from cache.\n");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            LOGGER.debug("Retrieved video ' {} ' from cache.\n", videoId);
        }
        return video;
    }
}
