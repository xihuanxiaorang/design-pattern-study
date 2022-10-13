package top.xiaorang.design.pattern.adapter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/14 3:18
 */
public class ApiTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            LOGGER.debug("Round peg r5 fits round hole r5.");
        }
        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);
//        roundHole.fits(smallSquarePeg); // Won't compile.
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        if (roundHole.fits(smallSquarePegAdapter)) {
            LOGGER.debug("Square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(largeSquarePegAdapter)) {
            LOGGER.debug("Square peg w20 dose not fit into round hole r5.");
        }
    }
}
