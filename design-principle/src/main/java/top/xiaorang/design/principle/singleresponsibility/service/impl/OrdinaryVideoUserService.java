package top.xiaorang.design.principle.singleresponsibility.service.impl;

import top.xiaorang.design.principle.singleresponsibility.service.IVideoUserService;

/**
 * @author liulei
 * @description 普通用户
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 0:00
 */
public class OrdinaryVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户，视频720P高清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
