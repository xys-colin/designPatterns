package cn.xys.factory.abstractFactory;

/**
 * @description: 抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
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
