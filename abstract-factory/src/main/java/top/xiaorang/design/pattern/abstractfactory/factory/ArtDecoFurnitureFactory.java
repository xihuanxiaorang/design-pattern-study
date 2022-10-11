package top.xiaorang.design.pattern.abstractfactory.factory;

import top.xiaorang.design.pattern.abstractfactory.chair.ArtDecoChair;
import top.xiaorang.design.pattern.abstractfactory.chair.Chair;
import top.xiaorang.design.pattern.abstractfactory.coffeetable.ArtDecoCoffeeTable;
import top.xiaorang.design.pattern.abstractfactory.coffeetable.CoffeeTable;
import top.xiaorang.design.pattern.abstractfactory.sofa.ArtDecoSofa;
import top.xiaorang.design.pattern.abstractfactory.sofa.Sofa;

/**
 * @author liulei
 * @description 装饰风艺术风格的家具厂
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/17 17:20
 */
public class ArtDecoFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
