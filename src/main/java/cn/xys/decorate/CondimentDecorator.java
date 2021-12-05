package cn.xys.decorate;

import cn.xys.decorate.Beverage;

/**
 * @description: 装饰者类，装饰者可以在所委托被装饰者的行为之前与/或之后，
 * 加上自己的行为，以达到特定的目的（关键点）
 * @author: muLin
 * @time: 2021/4/29 10:09
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
