package top.xiaorang.design.principle.singleresponsibility;

import org.junit.Test;

/**
 * @author liulei
 * @description 视频用户服务接口测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 0:23
 */
public class IVideoUserServiceTest {
    @Test
    public void test() {
        IVideoUserService videoUserService = new GuestVideoUserService();
        videoUserService.definition();
        videoUserService.advertisement();
    }
}