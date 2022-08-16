package top.xiaorang.design.pattern.factorymethod.factory;

import top.xiaorang.design.pattern.factorymethod.store.ICommodity;

/**
 * @author liulei
 * @description 发放奖品服务工厂
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:55
 */
public abstract class CommodityFactory {
    /**
     * 获取发放奖品服务
     *
     * @return 发放奖品服务
     */
    public abstract ICommodity getCommodityService();
}
