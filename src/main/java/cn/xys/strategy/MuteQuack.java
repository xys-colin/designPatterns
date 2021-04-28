package cn.xys.strategy;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/26 17:54
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("不会叫的鸭子");
    }
}
