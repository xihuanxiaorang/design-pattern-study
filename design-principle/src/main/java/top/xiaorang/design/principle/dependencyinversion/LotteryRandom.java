package top.xiaorang.design.principle.dependencyinversion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liulei
 * @description 随机抽奖
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 7:07
 */
public class LotteryRandom implements ILottery {
    @Override
    public List<BetUser> lottery(List<BetUser> betUsers, int count) {
        if (betUsers == null || betUsers.isEmpty() || count == 0) return new ArrayList<>();
        if (betUsers.size() <= count) return betUsers;
        // 乱序集合
        Collections.shuffle(betUsers);
        // 取出指定数量的中奖用户
        return betUsers.stream().limit(count).collect(Collectors.toList());
    }
}
