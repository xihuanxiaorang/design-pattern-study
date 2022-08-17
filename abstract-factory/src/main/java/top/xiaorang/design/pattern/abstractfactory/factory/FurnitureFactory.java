package top.xiaorang.design.pattern.abstractfactory.factory;

import top.xiaorang.design.pattern.abstractfactory.chair.Chair;
import top.xiaorang.design.pattern.abstractfactory.coffeetable.CoffeeTable;
import top.xiaorang.design.pattern.abstractfactory.sofa.Sofa;

/**
 * @author liulei
 * @description 家具厂
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 17:17
 */
public abstract class FurnitureFactory {
    /**
     * 生产一把椅子
     *
     * @return 椅子
     */
    protected abstract Chair createChair();

    /**
     * 生产一个咖啡桌
     *
     * @return 咖啡桌
     */
    protected abstract CoffeeTable createCoffeeTable();

    /**
     * 生成一个沙发
     *
     * @return 沙发
     */
    protected abstract Sofa createSofa();

    /**
     * 出厂测试
     */
    public void test() {
        Chair chair = createChair();
        chair.sitOn();
        Sofa sofa = createSofa();
        sofa.lying();
        CoffeeTable coffeeTable = createCoffeeTable();
        coffeeTable.drink();
    }
}
