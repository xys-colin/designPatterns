package cn.xys.strategy;

/**
 * @description: 策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
 * @author: muLin
 * @time: 2021/4/26 17:34
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
