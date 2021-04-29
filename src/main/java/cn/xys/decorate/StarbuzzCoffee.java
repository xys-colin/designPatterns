package cn.xys.decorate;

/**
 * @description: 装饰者模式——动态地将责任附加到对象上。想要扩展功能，装饰者提供有别于继承的另一种选择
 * @author: muLin
 * @time: 2021/4/29 10:29
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        //直接订一杯Espresso，不加调料
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1=new DarkRoast();
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2=new HouseBlend();
        beverage2=new Soy(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
