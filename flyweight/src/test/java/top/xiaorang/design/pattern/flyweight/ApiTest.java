package top.xiaorang.design.pattern.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/14 1:37
 */
public class ApiTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiTest.class);
    private static final int CANVAS_SIZE = 500;
    private static final int TREES_TO_DRAW = 1000000;
    private static final int TREE_TYPES = 2;

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE),
                    random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE),
                    random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        LOGGER.debug("TREES_TO_DRAW {}", TREES_TO_DRAW);
        LOGGER.debug("---------------------");
        LOGGER.debug("Memory usage:");
        LOGGER.debug("Tree size (8 bytes) * {}", TREES_TO_DRAW);
        LOGGER.debug("+ TreeTypes size (~30 bytes) * {}", TREE_TYPES);
        LOGGER.debug("---------------------");
        LOGGER.debug("Total: {}MB (instead of {}MB)", ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024), ((TREES_TO_DRAW * 38) / 1024 / 1024));
    }
}
