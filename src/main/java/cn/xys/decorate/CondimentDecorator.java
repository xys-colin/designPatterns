package cn.xys.decorate;

import cn.xys.decorate.Beverage;

/**
 * @description: 装饰者类，
 * @author: muLin
 * @time: 2021/4/29 10:09
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
