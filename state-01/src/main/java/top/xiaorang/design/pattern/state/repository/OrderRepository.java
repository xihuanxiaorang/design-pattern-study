package top.xiaorang.design.pattern.state.repository;

import org.springframework.stereotype.Repository;
import top.xiaorang.design.pattern.state.entity.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">订单持久层<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/13 2:16
 */
@Repository
public class OrderRepository {
    private final Map<Integer, Order> orders = new HashMap<>();

    public Order save(Integer id, Order order) {
        return orders.put(id, order);
    }

    public Order get(Integer id) {
        return orders.get(id);
    }

    public List<Order> findAll() {
        return new ArrayList<>(orders.values());
    }
}
