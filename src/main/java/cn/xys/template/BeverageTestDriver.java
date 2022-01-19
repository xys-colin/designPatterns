package cn.xys.template;

import cn.xys.template.hook.CoffeeWithHook;
import cn.xys.template.hook.TeaWithHook;

import java.util.Arrays;

/**
 * @description: 模板方法模式在一个方法中定义了一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法
 * 结构的情况下，重新定义算法中的某些步骤
 * @author: muLin
 * @time: 2021/5/12 11:23
 */
public class BeverageTestDriver {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
