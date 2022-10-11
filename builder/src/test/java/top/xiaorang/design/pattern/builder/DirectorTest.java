package top.xiaorang.design.pattern.builder;

import org.junit.Test;

/**
 * @author liulei
 * @description 汽车制造测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/19 2:32
 */
public class DirectorTest {
    @Test
    public void test() {
        Director director = new Director();
        Car chevroletCoupe = director.chevroletCoupe();
        System.out.println(chevroletCoupe);

        Car hummerSUV = director.hummerSUV();
        System.out.println(hummerSUV);
    }
}