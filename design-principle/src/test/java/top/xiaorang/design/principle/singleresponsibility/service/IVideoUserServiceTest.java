package top.xiaorang.design.principle.singleresponsibility.service;

import org.junit.Test;
import top.xiaorang.design.principle.singleresponsibility.service.impl.GuestVideoUserService;

/**
 * @author liulei
 * @description 视频用户服务接口测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 0:23
 */
public class IVideoUserServiceTest {
    @Test
    public void test() {
        IVideoUserService videoUserService = new GuestVideoUserService();
        videoUserService.definition();
        videoUserService.advertisement();
    }
}