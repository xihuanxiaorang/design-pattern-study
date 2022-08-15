package top.xiaorang.design.principle.demeter;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Map;

/**
 * @author liulei
 * @description 校长测试类
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/16 5:49
 */
public class PrincipalTest {
    @Test
    public void test() throws Exception {
        Principal principal = new Principal();
        Map<String, Object> map = principal.queryClazzInfo(new Teacher("marry", "3年A班"));
        System.out.println(JSON.toJSONString(map));
    }
}