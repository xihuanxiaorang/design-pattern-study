package top.xiaorang.design.principle.dependencyinversion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liulei
 * @description 投注用户
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 7:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BetUser {
    /**
     * 姓名
     */
    private String username;
    /**
     * 中奖权重
     */
    private int weight;
}
