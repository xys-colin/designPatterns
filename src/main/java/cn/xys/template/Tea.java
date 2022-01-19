package cn.xys.template;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/12 11:17
 */
public class Tea extends CaffeineBeverage {
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    protected void brew() {
        System.out.println("Steeping the tea");
    }

}
