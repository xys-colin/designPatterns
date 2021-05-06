package cn.xys.factory.factoryMethod;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/1 22:23
 */
public class NYStylePizzaStore extends PizzaStore{
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")){
           pizza= new NYStyleCheesePizza();
           pizza.setName("纽约风味芝士pizza");
        }else if (type.equals("veggie")){
            pizza= new NYStyleVeggiePizza();
            pizza.setName("纽约风味素菜pizza");
        }else
        return null;
        return pizza;
    }
}
