package top.xiaorang.design.pattern.proxy.basic;

/**
 * @author liulei
 * @description 订单业务层接口
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/21 22:44
 */
public interface OrderService {
    /**
     * 创建订单
     *
     * @param order 订单
     * @return 成功与否
     */
    int createOrder(Order order);

    Long getCreateTime(Order order);
}
