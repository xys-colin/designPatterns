package cn.xys.factory.abstractFactory;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/1 22:17
 */
public abstract class PizzaStore {
    //可以声明成final，以防止被子类覆盖
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //工厂方法
    protected abstract Pizza createPizza(String type);
}
