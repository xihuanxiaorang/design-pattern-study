package top.xiaorang.design.principle.demeter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liulei
 * @description 老师
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 5:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    /**
     * 学生
     */
    private static final List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("花花", 10, 589));
        students.add(new Student("豆豆", 54, 356));
        students.add(new Student("秋雅", 23, 439));
        students.add(new Student("皮皮", 2, 665));
        students.add(new Student("蛋蛋", 19, 502));
    }

    /**
     * 姓名
     */
    private String name;
    /**
     * 班级
     */
    private String clazz;

    /**
     * 计算班级总分
     *
     * @return 班级总分
     */
    public double clazzTotalScore() {
        return students.stream().mapToDouble(Student::getGrade).sum();
    }

    /**
     * 计算班级平均分
     *
     * @return 班级平均分
     */
    public double clazzAverageScore() {
        return students.stream().mapToDouble(Student::getGrade).average().orElse(0);
    }

    /**
     * 获取班级总人数
     *
     * @return 班级总人数
     */
    public int clazzStudentCount() {
        return students.size();
    }
}
