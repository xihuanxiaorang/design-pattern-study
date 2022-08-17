package top.xiaorang.design.pattern.abstractfactory.chair;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 装饰风艺术风格的椅子
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 17:09
 */
@Slf4j
public class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        log.info("坐在装饰风艺术风格的椅子上");
    }
}
