package cn.xys.factory.simpleFactory;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/25 15:52
 */
public class SimplePizzaFactory {
    /**
     * 可以定义为一个静态方法，就不需要创建对象的方法来实例化对象，但也有缺点，不能通过继承来改变创建方法的行为。
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 芝士披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
