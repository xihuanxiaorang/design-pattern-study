package top.xiaorang.design.pattern.factorymethod.factory;

import org.junit.Test;

/**
 * @author liulei
 * @description 后勤中心测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/17 15:19
 */
public class ApiTest {
    @Test
    public void test() {
        // 陆路运输
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        // 海上运输
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}