package cn.xys.factory.simpleFactory;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/25 15:17
 */
public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println("给芝士Pizza准备原材料");
    }
}
