package fun.xiaorang.design.pattern.strategy;

/**
 * @author xiaorang
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://docs.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2024/04/01 23:42
 */
public class FlyRocketPowered implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I'm flying with a rocket!");
  }
}
