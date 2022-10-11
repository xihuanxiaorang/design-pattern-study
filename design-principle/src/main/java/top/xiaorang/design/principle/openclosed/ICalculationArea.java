package top.xiaorang.design.principle.openclosed;

/**
 * @author liulei
 * @description 面积计算接口
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 2:02
 */
public interface ICalculationArea {
    /**
     * 计算长方形面积
     *
     * @param x 长
     * @param y 宽
     * @return 面积
     */
    double rectangle(double x, double y);

    /**
     * 计算三角形面积
     * 海伦公式：S=√[p(p-a)(p-b)(p-c)] 其中：p=(a+b+c)/2
     *
     * @param x 边长x
     * @param y 边长y
     * @param z 边长z
     * @return 面积
     */
    double triangle(double x, double y, double z);

    /**
     * 计算圆的面积
     * 圆面积公式：S=πr²
     *
     * @param r 半径
     * @return 面积
     */
    double circular(double r);
}
