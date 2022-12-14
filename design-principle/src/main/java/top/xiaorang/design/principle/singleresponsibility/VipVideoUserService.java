package top.xiaorang.design.principle.singleresponsibility;

/**
 * @author liulei
 * @description VIP用户
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 0:02
 */
public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("VIP用户，视频1080P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP用户，视频无广告");
    }
}
