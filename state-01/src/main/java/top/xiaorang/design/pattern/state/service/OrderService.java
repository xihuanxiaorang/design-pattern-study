package top.xiaorang.design.pattern.state.service;

import top.xiaorang.design.pattern.state.entity.Order;

import java.util.List;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">订单服务接口<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/13 2:10
 */
public interface OrderService {
    Order creat();

    Order pay(Integer id);

    Order deliver(Integer id);

    Order receive(Integer id);

    List<Order> getAllOrders();
}
