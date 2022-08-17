package top.xiaorang.design.pattern.factorymethod.factory;

import top.xiaorang.design.pattern.factorymethod.Transport;
import top.xiaorang.design.pattern.factorymethod.Truck;

/**
 * @author liulei
 * @description 陆路运输
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 15:16
 */
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
