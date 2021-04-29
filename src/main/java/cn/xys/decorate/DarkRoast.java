package cn.xys.decorate;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/29 10:32
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description="DarkRoast";
    }

    public double cost() {
        return .99;
    }
}
