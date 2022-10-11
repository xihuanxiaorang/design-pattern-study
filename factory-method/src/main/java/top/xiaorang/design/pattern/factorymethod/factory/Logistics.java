package top.xiaorang.design.pattern.factorymethod.factory;

import top.xiaorang.design.pattern.factorymethod.Transport;

/**
 * @author liulei
 * @description 后勤中心
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/17 15:12
 */
public abstract class Logistics {
    /**
     * 使用何种方式运输
     *
     * @return 运输手段
     */
    protected abstract Transport createTransport();

    /**
     * 计划交付货物
     */
    public void planDelivery() {
        Transport transport = createTransport();
        transport.delivery();
    }
}
