package top.xiaorang.design.pattern.factorymethod.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liulei
 * @description 发放优惠券返回结果
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponResult {
    private String code;
    private String info;
}
