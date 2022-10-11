package top.xiaorang.design.principle.liskovsubstitution;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author liulei
 * @description 储蓄卡
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 5:03
 */
@Slf4j
public class CashCard extends BankCard {
    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    @Override
    boolean rule(BigDecimal amount) {
        return true;
    }

    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败、0002重复
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        log.info("提现成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 充值
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败、0002重复
     */
    public String recharge(String orderId, BigDecimal amount) {
        log.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }

    /**
     * 分控校验
     *
     * @param cardNo  卡号
     * @param orderId 单号
     * @param amount  金额
     * @return 是否成功
     */
    public boolean checkRisk(String cardNo, String orderId, BigDecimal amount) {
        log.info("风控校验，卡号：{} 单号：{} 金额：{}", cardNo, orderId, amount);
        return true;
    }
}
