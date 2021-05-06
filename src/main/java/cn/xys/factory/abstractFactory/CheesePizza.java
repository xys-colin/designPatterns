package cn.xys.factory.abstractFactory;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/6 20:18
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    protected void prepare() {
        System.out.println("Preparing "+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
    }
}
