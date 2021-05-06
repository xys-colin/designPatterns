package cn.xys.factory.abstractFactory;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/6 20:54
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory factory=new NYPizzaIngredientFactory();
        if (type.equals("cheese")){
            pizza=new CheesePizza(factory);
            pizza.setName("New York Style Cheese Pizza");
        }else if (type.equals("clam")){
            pizza=new ClamPizza(factory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
