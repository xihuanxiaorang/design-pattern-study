package top.xiaorang.design.pattern.factorymethod.coupon;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 优惠券服务
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:37
 */
@Slf4j
public class CouponService {
    /**
     * 发放优惠券
     *
     * @param userId       用户id
     * @param couponNumber 优惠券号码
     * @param uuid         随机字符串
     * @return CouponResult
     */
    public CouponResult sendCoupon(String userId, String couponNumber, String uuid) {
        log.info("模拟发放优惠券一张：{},{},{}", userId, couponNumber, uuid);
        return new CouponResult("0000", "发放成功");
    }
}
