package cn.xys.factory.simpleFactory;

import cn.xys.factory.Pizza;

/**
 * @description: 简单工厂其实不是一个设计模式，反而比较像是一种编程习惯
 * @author: muLin
 * @time: 2021/4/25 15:39
 */
public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory=factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore=new PizzaStore(new SimplePizzaFactory());
        Pizza pizza= pizzaStore.orderPizza("cheese");
    }
}
