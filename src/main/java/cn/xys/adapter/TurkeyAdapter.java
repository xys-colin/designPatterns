package cn.xys.adapter;

/**
 * @description: 适配器(这里是对象适配器), 首先需要实现想转换的类型接口,也就是客户所期望看到的接口
 * @author: muLin
 * @time: 2021/5/10 23:32
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;
    //取得要适配的对象引用
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
