package top.xiaorang.design.pattern.proxy.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulei
 * @description 测试<p style = " font-weight:bold ; ">加载视频时使用缓存（代理/增强）与不使用缓存的区别<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/10 3:33
 */
public class ApiTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiTest.class);

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // 用户可能访问同样的视频
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");
        long estimatedTime = System.currentTimeMillis() - startTime;
        LOGGER.debug("Time elapsed: {}ms\n", estimatedTime);
        return estimatedTime;
    }

    @Test
    public void test() {
        ThirdPartyYouTubeClass thirdPartyYouTubeClass = new ThirdPartyYouTubeClass();
        YouTubeCacheProxy youTubeCacheProxy = new YouTubeCacheProxy(thirdPartyYouTubeClass);
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(thirdPartyYouTubeClass);
        YouTubeDownloader smartDownloader = new YouTubeDownloader(youTubeCacheProxy);

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        LOGGER.debug("Time saved by caching proxy: {}ms", (naive - smart));
    }
}
