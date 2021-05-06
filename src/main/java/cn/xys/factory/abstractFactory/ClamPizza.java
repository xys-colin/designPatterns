package cn.xys.factory.abstractFactory;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/6 20:43
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    protected void prepare() {
        System.out.println("Preparing "+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
        clams=ingredientFactory.createClams();
    }
}
