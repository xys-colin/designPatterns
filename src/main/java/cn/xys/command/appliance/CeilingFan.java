package cn.xys.command.appliance;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/10 17:34
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    //设置转速
    public void high() {
        speed = HIGH;
        System.out.println("ceiling Fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("ceiling Fan is on medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("ceiling Fan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println("ceiling Fan is on off");
    }

    public int getSpeed() {
        return speed;
    }
}
