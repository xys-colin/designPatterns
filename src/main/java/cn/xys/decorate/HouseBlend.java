package cn.xys.decorate;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/29 10:15
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="House Blend Coffee";
    }
    public double cost() {
        return .89;
    }
}
