package cn.xys.decorate;

/**
 * @description: 浓缩咖啡。具体的组件，也就是咖啡类型
 * @author: muLin
 * @time: 2021/4/29 10:12
 */
public class Espresso extends Beverage {
    public Espresso(){
        description="Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
