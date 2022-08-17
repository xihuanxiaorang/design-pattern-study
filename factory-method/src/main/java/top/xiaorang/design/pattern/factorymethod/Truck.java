package top.xiaorang.design.pattern.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 卡车
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 15:09
 */
@Slf4j
public class Truck implements Transport {
    @Override
    public void delivery() {
        log.info("卡车走陆路交付货物");
    }
}
