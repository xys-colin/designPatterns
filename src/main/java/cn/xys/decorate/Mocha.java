package cn.xys.decorate;

/**
 * @description: 摩卡是一个装饰者，所以扩展自装饰者类
 * @author: muLin
 * @time: 2021/4/29 10:19
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    public double cost() {
        return beverage.cost()+.20;
    }
}
