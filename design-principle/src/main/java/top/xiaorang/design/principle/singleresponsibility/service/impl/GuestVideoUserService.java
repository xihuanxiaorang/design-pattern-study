package top.xiaorang.design.principle.singleresponsibility.service.impl;

import top.xiaorang.design.principle.singleresponsibility.service.IVideoUserService;

/**
 * @author liulei
 * @description 访客用户
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/15 23:58
 */
public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户，视频480P高清");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
