package top.xiaorang.design.pattern.factorymethod.store.impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import top.xiaorang.design.pattern.factorymethod.card.IQiYiCardService;
import top.xiaorang.design.pattern.factorymethod.store.ICommodity;

import java.util.Map;

/**
 * @author liulei
 * @description 发放爱奇艺视频卡服务
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:51
 */
@Slf4j
public class CardCommodityService implements ICommodity {
    private final IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        log.info("请求参数[爱奇艺视频卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        iQiYiCardService.grantToken("15200101232", bizId);
        log.info("测试结果[爱奇艺视频卡]：success");
    }
}
