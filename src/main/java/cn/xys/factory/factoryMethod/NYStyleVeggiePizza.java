package cn.xys.factory.factoryMethod;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/2 22:21
 */
public class NYStyleVeggiePizza extends Pizza {

    public void prepare() {
        System.out.println("准备NYStyleVeggiePizza");
    }
}
