package top.xiaorang.design.pattern.state.enums;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">订单状态枚举<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/13 1:26
 */
public enum OrderStatus {
    /**
     * 待支付
     */
    WAIT_PAYMENT,
    /**
     * 代发货
     */
    WAIT_DELIVER,
    /**
     * 待收货
     */
    WAIT_RECEIVE,
    /**
     * 已结束
     */
    FINISH
}
