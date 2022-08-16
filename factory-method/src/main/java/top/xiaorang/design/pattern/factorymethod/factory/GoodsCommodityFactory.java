package top.xiaorang.design.pattern.factorymethod.factory;

import top.xiaorang.design.pattern.factorymethod.store.ICommodity;
import top.xiaorang.design.pattern.factorymethod.store.impl.GoodsCommodityService;

/**
 * @author liulei
 * @description 发放实体奖品服务工厂
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 2:00
 */
public class GoodsCommodityFactory extends CommodityFactory {
    @Override
    public ICommodity getCommodityService() {
        return new GoodsCommodityService();
    }
}
