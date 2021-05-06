package cn.xys.factory.factoryMethod;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/2 22:28
 */
public class ChicagoCheesePizza extends Pizza {
    public void prepare() {
        System.out.println("准备ChicagoCheesePizza");
    }
}
