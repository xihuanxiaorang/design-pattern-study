package top.xiaorang.design.pattern.abstractfactory.coffeetable;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 装饰风艺术风格的咖啡桌
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 17:07
 */
@Slf4j
public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void drink() {
        log.info("在装饰风艺术风格的咖啡桌上喝咖啡");
    }
}
