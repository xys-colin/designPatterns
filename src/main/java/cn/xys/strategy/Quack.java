package cn.xys.strategy;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/26 17:52
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("鸭子呱呱叫");
    }
}
