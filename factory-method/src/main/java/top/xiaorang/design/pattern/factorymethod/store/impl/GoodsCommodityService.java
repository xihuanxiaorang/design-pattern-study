package top.xiaorang.design.pattern.factorymethod.store.impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import top.xiaorang.design.pattern.factorymethod.goods.DeliverReq;
import top.xiaorang.design.pattern.factorymethod.goods.GoodsService;
import top.xiaorang.design.pattern.factorymethod.store.ICommodity;

import java.util.Map;

/**
 * @author liulei
 * @description 发放实体奖品服务
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:47
 */
@Slf4j
public class GoodsCommodityService implements ICommodity {
    private final GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String userId, String commodityId, String bizId, Map<String, String> extMap) {
        log.info("请求参数[实物商品] => userId：{} commodityId：{} bizId：{} extMap：{}", userId, commodityId, bizId, JSON.toJSON(extMap));
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName("花花");
        deliverReq.setUserPhone("15200101232");
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUsername(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
        log.info("测试结果[实物商品]：{}", isSuccess);
    }
}
