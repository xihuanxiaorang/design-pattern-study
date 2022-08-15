package top.xiaorang.design.principle.lawofdemeter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liulei
 * @description 学生
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 5:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 总排名
     */
    private int rank;
    /**
     * 总分
     */
    private double grade;
}
