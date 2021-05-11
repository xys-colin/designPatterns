package cn.xys.adapter;

/**
 * @description: 适配器模式将一个类的接口，转换成客户期望的另外一个接口。适配器让原本接口不兼容的类可以合作无间
 * @author: muLin
 * @time: 2021/5/10 23:48
 */
public class DuckTestDriver {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        //将火鸡包进一个火鸡适配器中，使它看起来像一只鸭子
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
