package cn.xys.template;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/12 11:19
 */
public class Coffee extends CaffeineBeverage {
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
