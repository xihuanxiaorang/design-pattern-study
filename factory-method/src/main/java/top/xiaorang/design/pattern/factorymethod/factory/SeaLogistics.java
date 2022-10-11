package top.xiaorang.design.pattern.factorymethod.factory;

import top.xiaorang.design.pattern.factorymethod.Ship;
import top.xiaorang.design.pattern.factorymethod.Transport;

/**
 * @author liulei
 * @description 海上运输
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/17 15:18
 */
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
