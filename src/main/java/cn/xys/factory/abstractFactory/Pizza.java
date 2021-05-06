package cn.xys.factory.abstractFactory;

import cn.xys.factory.abstractFactory.ingredients.*;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/6 20:06
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    protected abstract void prepare();
    protected void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    protected void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    protected void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
