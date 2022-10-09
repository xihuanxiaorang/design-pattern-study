package top.xiaorang.design.pattern.proxy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">远程服务实现<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/10 3:48
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYoutubeLib {
    private static final Logger LOGGER = LoggerFactory.getLogger(ThirdPartyYouTubeClass.class);

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private void connectToServer(String server) {
        LOGGER.debug("Connecting to {} ... ", server);
        experienceNetworkLatency();
        LOGGER.debug("Connected!\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        LOGGER.debug("Downloading populars... ");
        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
        LOGGER.debug("Done!\n");
        return hmap;
    }

    // Fake methods to simulate network activity. They as slow as a real life.
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private Video getSomeVideo(String videoId) {
        LOGGER.debug("Downloading video... ");
        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");
        LOGGER.debug("Done!\n");
        return video;
    }
}
