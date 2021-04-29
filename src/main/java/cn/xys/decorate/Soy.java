package cn.xys.decorate;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/29 10:23
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    public double cost() {
        return beverage.cost()+.15;
    }
}
