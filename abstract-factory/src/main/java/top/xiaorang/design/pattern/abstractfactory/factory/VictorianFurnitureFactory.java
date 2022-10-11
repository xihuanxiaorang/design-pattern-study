package top.xiaorang.design.pattern.abstractfactory.factory;

import top.xiaorang.design.pattern.abstractfactory.chair.Chair;
import top.xiaorang.design.pattern.abstractfactory.chair.VictorianChair;
import top.xiaorang.design.pattern.abstractfactory.coffeetable.CoffeeTable;
import top.xiaorang.design.pattern.abstractfactory.coffeetable.VictorianCoffeeTable;
import top.xiaorang.design.pattern.abstractfactory.sofa.Sofa;
import top.xiaorang.design.pattern.abstractfactory.sofa.VictorianSofa;

/**
 * @author liulei
 * @description 维多利亚风格的家具厂
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/17 17:20
 */
public class VictorianFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
