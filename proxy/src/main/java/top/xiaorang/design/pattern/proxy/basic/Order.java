package top.xiaorang.design.pattern.proxy.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liulei
 * @description 订单
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/21 22:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Object orderInfo;
    private Long createTime;
    private String id;
}
