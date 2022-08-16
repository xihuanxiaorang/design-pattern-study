package top.xiaorang.design.pattern.factorymethod.store.impl;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import top.xiaorang.design.pattern.factorymethod.coupon.CouponResult;
import top.xiaorang.design.pattern.factorymethod.coupon.CouponService;
import top.xiaorang.design.pattern.factorymethod.store.ICommodity;

import java.util.Map;

/**
 * @author liulei
 * @description 发放优惠券服务
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:28
 */
@Slf4j
public class CouponCommodityService implements ICommodity {
    private final CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String userId, String commodityId, String bizId, Map<String, String> extMap) {
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", userId, commodityId, bizId, JSON.toJSON(extMap));
        CouponResult couponResult = couponService.sendCoupon(userId, commodityId, bizId);
        log.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
    }
}
