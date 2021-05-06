package cn.xys.factory.factoryMethod;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/1 22:26
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")){
            pizza= new ChicagoCheesePizza();
            pizza.setName("芝加哥风味芝士pizza");
        }else if (type.equals("veggie")){
            pizza= new ChicagoVeggiePizza();
            pizza.setName("芝加哥风味素菜pizza");
        }else
            return null;
        return pizza;
    }
}
