package top.xiaorang.design.principle.dependencyinversion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liulei
 * @description 权重抽奖
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 7:11
 */
public class LotteryWeightRank implements ILottery {
    @Override
    public List<BetUser> lottery(List<BetUser> betUsers, int count) {
        if (betUsers == null || betUsers.isEmpty() || count == 0) return new ArrayList<>();
        if (betUsers.size() <= count) return betUsers;
        return betUsers.stream()
                .sorted(Comparator.comparingInt(BetUser::getWeight).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }
}
