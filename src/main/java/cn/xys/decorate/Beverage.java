package cn.xys.decorate;

/**
 * @description: 相当于抽象的Component。通常装饰者模式是采用抽象类，但是在Java中可以使用接口
 * 这里使用继承是为了获得“类型匹配”，而不是利用继承获得“行为”，
 * @author: muLin
 * @time: 2021/4/29 9:52
 */
public abstract class Beverage {
    String description="Unknown beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
