package cn.xys.adapter;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/10 23:18
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
