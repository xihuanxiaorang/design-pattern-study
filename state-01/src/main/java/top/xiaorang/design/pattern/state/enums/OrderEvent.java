package top.xiaorang.design.pattern.state.enums;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">订单事件<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/13 1:29
 */
public enum OrderEvent {
    /**
     * 支付
     */
    PAYED,
    /**
     * 发货
     */
    DELIVERY,
    /**
     * 确认收获
     */
    RECEIVED
}
