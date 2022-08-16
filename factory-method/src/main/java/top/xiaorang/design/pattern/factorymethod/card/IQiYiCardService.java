package top.xiaorang.design.pattern.factorymethod.card;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 爱奇艺视频卡服务
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:32
 */
@Slf4j
public class IQiYiCardService {
    /**
     * @param bindMobileNumber 绑定的手机号
     * @param cardId           卡号
     */
    public void grantToken(String bindMobileNumber, String cardId) {
        log.info("模拟发放爱奇艺会员卡一张：{}，{}", bindMobileNumber, cardId);
    }
}
