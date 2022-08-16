package top.xiaorang.design.pattern.factorymethod.goods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liulei
 * @description 交付信息
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliverReq {
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户手机
     */
    private String userPhone;
    /**
     * 商品SKU
     */
    private String sku;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 收货人姓名
     */
    private String consigneeUsername;
    /**
     * 收货人电话
     */
    private String consigneeUserPhone;
    /**
     * 收货人地址
     */
    private String consigneeUserAddress;
}
