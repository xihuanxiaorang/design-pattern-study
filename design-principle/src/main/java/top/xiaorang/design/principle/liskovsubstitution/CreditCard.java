package top.xiaorang.design.principle.liskovsubstitution;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author liulei
 * @description 信用卡
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 5:08
 */
@Slf4j
public class CreditCard extends CashCard {
    public CreditCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    /**
     * 规则2，不要重写父类非抽象（已实现）的方法
     *
     * @param amount 金额
     * @return 是否成功
     */
    boolean rule2(BigDecimal amount) {
        return amount.compareTo(new BigDecimal(1000)) <= 0;
    }

    /**
     * 信用卡贷款
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败、0002重复
     */
    public String loan(String orderId, BigDecimal amount) {
        boolean rule = rule2(amount);
        if (!rule) {
            log.info("生成贷款单失败，金额超限。单号：{} 金额：{}", orderId, amount);
            return "0001";
        }
        log.info("生成贷款单，单号：{} 金额：{}", orderId, amount);
        log.info("贷款成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 信用卡还款
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败、0002重复
     */
    public String repayment(String orderId, BigDecimal amount) {
        log.info("生成还款单，单号：{} 金额：{}", orderId, amount);
        log.info("还款成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }
}
