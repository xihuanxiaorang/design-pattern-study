package top.xiaorang.design.principle.openclosedresponsibility;

import org.junit.Test;

/**
 * @author liulei
 * @description 面积计算接口测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 2:51
 */
public class ICalculationAreaTest {
    @Test
    public void test() {
        ICalculationArea calculationArea = new CalculationAreaExt();
        double r = 10;
        double circular = calculationArea.circular(r);
        System.out.printf("半径为%.2f的圆的面积=%.8f", r, circular);
    }
}