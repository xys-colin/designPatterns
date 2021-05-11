package cn.xys.decorate.condiment;

import cn.xys.decorate.Beverage;
import cn.xys.decorate.CondimentDecorator;

import java.io.FilterInputStream;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/29 10:27
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    public double cost() {
        return beverage.cost()+.10;
    }
}
