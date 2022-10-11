package top.xiaorang.design.principle.interfacesegregation;

/**
 * @author liulei
 * @description 廉颇
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @date 2022/8/16 6:45
 */
public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISkillVertigo {
    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }
}
