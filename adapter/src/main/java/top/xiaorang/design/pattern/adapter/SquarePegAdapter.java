package top.xiaorang.design.pattern.adapter;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">适配器允许将方形钉安装到圆孔中<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/14 4:50
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // 计算一个最小圆半径，它可以适合这个 peg
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
