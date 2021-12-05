package cn.xys.factory.abstractFactory;

/**
 * @description: 抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
 * 抽象工厂的方法经常以工厂方法的方式实现，抽象工厂的任务是定义一个负责创建一组产品的接口。这个接口内的每个方法都负责创建一个具体产品
 * 同时我们利用实现抽象工厂的子类来提供这些具体的做法。所以工厂方法模式潜伏在抽象工厂里面
 * @author: muLin
 * @time: 2021/5/6 21:01
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
    }
}
