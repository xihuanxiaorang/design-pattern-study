package top.xiaorang.design.pattern.adapter;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">圆孔<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/14 4:42
 */
public class RoundHole {
    /**
     * 半径
     */
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
