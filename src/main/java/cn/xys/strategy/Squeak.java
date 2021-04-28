package cn.xys.strategy;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/26 17:53
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("橡皮鸭吱吱叫");
    }
}
