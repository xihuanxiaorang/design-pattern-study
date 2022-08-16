package top.xiaorang.design.pattern.factorymethod.store;

import java.util.Map;

/**
 * @author liulei
 * @description 发放奖品接口
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:23
 */
public interface ICommodity {
    /**
     * 发放奖品
     *
     * @param userId      用户id
     * @param commodityId 奖品id
     * @param bizId       业务id
     * @param extMap      扩展参数
     */
    void sendCommodity(String userId, String commodityId, String bizId, Map<String, String> extMap);
}
