package top.xiaorang.design.principle.dependencyinversion;

import java.util.List;

/**
 * @author liulei
 * @description 抽奖接口
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 7:03
 */
public interface ILottery {
    /**
     * 抽奖
     *
     * @param betUsers 投注用户
     * @param count    中奖人数
     * @return 中奖用户
     */
    List<BetUser> lottery(List<BetUser> betUsers, int count);
}
