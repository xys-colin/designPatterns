package cn.xys.factory.simpleFactory;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/25 15:19
 */
public class GreekPizza extends Pizza {
    public void prepare() {
        System.out.println("给希腊Pizza准备原材料");
    }
}
