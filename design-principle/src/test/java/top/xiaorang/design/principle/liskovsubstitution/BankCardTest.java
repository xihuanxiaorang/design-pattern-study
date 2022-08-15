package top.xiaorang.design.principle.liskovsubstitution;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author liulei
 * @description
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 5:13
 */
@Slf4j
public class BankCardTest {
    @Test
    public void test() {
        log.info("里氏替换前，CashCard类：");
        CashCard cashCard = new CashCard("6214567800989876", "2022-03-05");
        cashCard.withdrawal("100001", new BigDecimal(100));
        cashCard.recharge("100001", new BigDecimal(100));

        log.info("里氏替换后，CreditCard类：");
        CashCard creditCard = new CreditCard("6214567800989876", "2022-03-05");
        creditCard.withdrawal("100001", new BigDecimal(100));
        creditCard.recharge("100001", new BigDecimal(100));
    }

    @Test
    public void test1() {
        CreditCard creditCard = new CreditCard("6214567800989876", "2022-03-05");
        creditCard.loan("100001", new BigDecimal(100));
        creditCard.repayment("100001", new BigDecimal(100));
    }
}