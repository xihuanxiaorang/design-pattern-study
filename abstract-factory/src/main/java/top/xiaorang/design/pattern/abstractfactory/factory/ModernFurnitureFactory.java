package top.xiaorang.design.pattern.abstractfactory.factory;

import top.xiaorang.design.pattern.abstractfactory.chair.Chair;
import top.xiaorang.design.pattern.abstractfactory.chair.ModernChair;
import top.xiaorang.design.pattern.abstractfactory.coffeetable.CoffeeTable;
import top.xiaorang.design.pattern.abstractfactory.coffeetable.ModernCoffeeTable;
import top.xiaorang.design.pattern.abstractfactory.sofa.ModernSofa;
import top.xiaorang.design.pattern.abstractfactory.sofa.Sofa;

/**
 * @author liulei
 * @description 摩登风格的家具厂
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 17:19
 */
public class ModernFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
