package top.xiaorang.design.principle.interfacesegregation;

import org.junit.Test;

/**
 * @author liulei
 * @description
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 6:46
 */
public class ISkillTest {
    @Test
    public void test() {
        HeroHouYi heroHouYi = new HeroHouYi();
        heroHouYi.doArchery();

        HeroLianPo heroLianPo = new HeroLianPo();
        heroLianPo.doVertigo();
    }
}