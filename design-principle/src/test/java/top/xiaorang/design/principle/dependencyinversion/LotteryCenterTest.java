package top.xiaorang.design.principle.dependencyinversion;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liulei
 * @description 抽奖中心测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 7:17
 */
@Slf4j
public class LotteryCenterTest {
    @Test
    public void test() throws Exception {
        List<BetUser> betUsers = new ArrayList<>();
        betUsers.add(new BetUser("花花", 65));
        betUsers.add(new BetUser("豆豆", 43));
        betUsers.add(new BetUser("小白", 72));
        betUsers.add(new BetUser("笨笨", 89));
        betUsers.add(new BetUser("丑蛋", 10));

        LotteryCenter lotteryCenter = new LotteryCenter();
        List<BetUser> randomBetUserList = lotteryCenter.lottery(new LotteryRandom(), betUsers, 3);
        log.info("随机抽奖，中奖用户名单：{}", JSON.toJSON(randomBetUserList));
        List<BetUser> weightRankBetUserList = lotteryCenter.lottery(new LotteryWeightRank(), betUsers, 3);
        log.info("权重抽奖，中奖用户名单：{}", JSON.toJSON(weightRankBetUserList));
    }
}