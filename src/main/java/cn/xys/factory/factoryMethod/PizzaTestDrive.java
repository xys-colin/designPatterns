package cn.xys.factory.factoryMethod;

import cn.xys.factory.Pizza;

/**
 * @description: 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 * @author: muLin
 * @time: 2021/5/3 11:39
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYStylePizzaStore();
        PizzaStore chicagoStore=new ChicagoStylePizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName());

        pizza=chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName());
    }
}
