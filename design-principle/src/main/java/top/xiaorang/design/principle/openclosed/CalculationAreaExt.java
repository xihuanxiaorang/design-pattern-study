package top.xiaorang.design.principle.openclosed;

/**
 * @author liulei
 * @description
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 2:51
 */
public class CalculationAreaExt extends CalculationArea {
    @Override
    public double circular(double r) {
        return Math.PI * r * r;
    }
}
