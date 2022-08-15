package top.xiaorang.design.principle.dependencyinversion;

import java.util.List;

/**
 * @author liulei
 * @description 抽奖中心
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 7:13
 */
public class LotteryCenter {
    public List<BetUser> lottery(ILottery lottery, List<BetUser> betUsers, int count) throws Exception {
        if (lottery == null) throw new Exception("请选择一个抽奖方式【随机抽奖 | 权重抽奖】");
        return lottery.lottery(betUsers, count);
    }
}
