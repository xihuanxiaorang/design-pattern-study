package top.xiaorang.design.pattern.abstractfactory.sofa;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 维多利亚风格的沙发
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 17:06
 */
@Slf4j
public class VictorianSofa implements Sofa {
    @Override
    public void lying() {
        log.info("躺在维多利亚风格的沙发上");
    }
}
