package cn.xys.factory.factoryMethod;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/2 21:56
 */
public class NYStyleCheesePizza extends Pizza {
    public void prepare() {
        System.out.println("准备纽NYStyleCheesePizza");
    }
}
