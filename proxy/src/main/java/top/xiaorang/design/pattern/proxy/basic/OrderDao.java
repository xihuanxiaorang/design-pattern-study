package top.xiaorang.design.pattern.proxy.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 订单持久层
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/21 22:42
 */
@Slf4j
public class OrderDao {
    public int insert(Order order) {
        log.info("OrderDao 创建 {} 成功！", order);
        return 1;
    }
}
