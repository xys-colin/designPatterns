package cn.xys.factory.abstractFactory;

import cn.xys.factory.abstractFactory.ingredients.*;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/6 20:33
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new RegainCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(),new Onion(),new RedPepper()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
