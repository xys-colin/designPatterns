package cn.xys.strategy;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/26 17:49
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("不会飞的鸭子");
    }
}
