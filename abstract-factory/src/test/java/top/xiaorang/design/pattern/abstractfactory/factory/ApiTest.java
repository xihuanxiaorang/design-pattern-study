package top.xiaorang.design.pattern.abstractfactory.factory;

import org.junit.Test;

/**
 * @author liulei
 * @description 家具厂测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/17 17:22
 */
public class ApiTest {
    @Test
    public void test() {
        // 摩登风格
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        modernFurnitureFactory.test();

        // 维多利亚风格
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        victorianFurnitureFactory.test();

        // 装饰风艺术风格
        FurnitureFactory artDecoFurnitureFactory = new ArtDecoFurnitureFactory();
        artDecoFurnitureFactory.test();
    }
}