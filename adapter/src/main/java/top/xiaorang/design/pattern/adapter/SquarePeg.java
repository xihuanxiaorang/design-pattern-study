package top.xiaorang.design.pattern.adapter;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">方钉<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/14 4:47
 */
public class SquarePeg {
    /**
     * 宽度
     */
    private final double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }

    public double getWidth() {
        return width;
    }
}
