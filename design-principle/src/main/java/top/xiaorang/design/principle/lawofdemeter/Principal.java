package top.xiaorang.design.principle.lawofdemeter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liulei
 * @description 校长
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 5:35
 */
public class Principal {
    public Map<String, Object> queryClazzInfo(Teacher teacher) throws Exception {
        if (teacher == null) throw new Exception("请明确要查询哪个老师的班级信息");
        Map<String, Object> map = new HashMap<>();
        map.put("班级", teacher.getClazz());
        map.put("老师", teacher.getName());
        map.put("班级总人数", teacher.clazzStudentCount());
        map.put("班级总分数", teacher.clazzTotalScore());
        map.put("班级平均分", teacher.clazzAverageScore());
        return map;
    }
}
