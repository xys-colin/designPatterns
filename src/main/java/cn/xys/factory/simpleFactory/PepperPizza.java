package cn.xys.factory.simpleFactory;

import cn.xys.factory.Pizza;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/25 15:36
 */
public class PepperPizza extends Pizza {
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}
