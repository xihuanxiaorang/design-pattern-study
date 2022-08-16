package top.xiaorang.design.pattern.factorymethod.factory;

import org.junit.Test;
import top.xiaorang.design.pattern.factorymethod.store.ICommodity;

import java.util.HashMap;

/**
 * @author liulei
 * @description 发放奖品工厂测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 2:04
 */
public class CommodityFactoryTest {
    @Test
    public void test() {
        CommodityFactory commodityFactory = new CouponCommodityFactory();
        ICommodity commodityService_1 = commodityFactory.getCommodityService();
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        commodityFactory = new GoodsCommodityFactory();
        ICommodity commodityService_2 = commodityFactory.getCommodityService();
        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});

        commodityFactory = new CardCommodityFactory();
        ICommodity commodityService_3 = commodityFactory.getCommodityService();
        commodityService_3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);
    }
}