package top.xiaorang.design.pattern.builder;

/**
 * @author liulei
 * @description 主管
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/19 2:24
 */
public class Director {
    /**
     * 雪佛兰小轿车
     *
     * @return 汽车
     */
    public Car chevroletCoupe() {
        return new Car.Builder().setSeats(4).setEngine("油电混合").setShape("小轿车").build();
    }

    /**
     * 悍马越野车
     *
     * @return 汽车
     */
    public Car hummerSUV() {
        return new Car.Builder().setSeats(4).setGps("车辆导航系统").setEngine("汽油机").setShape("SUV").build();
    }
}
