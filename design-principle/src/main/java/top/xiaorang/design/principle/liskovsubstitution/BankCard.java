package top.xiaorang.design.principle.liskovsubstitution;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author liulei
 * @description 银行卡
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 4:08
 */
@Slf4j
@Data
public abstract class BankCard {
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 开卡时间
     */
    private String cardDate;

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    /**
     * 规则
     *
     * @param amount 金额
     * @return 是否成功
     */
    abstract boolean rule(BigDecimal amount);

    /**
     * 入款成功，存款、还款
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败、0002重复
     */
    public String positive(String orderId, BigDecimal amount) {
        log.info("卡号{} 入款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * 逆向入账，- 钱
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败、0002重复
     */
    public String negative(String orderId, BigDecimal amount) {
        log.info("卡号{} 出款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }
}
