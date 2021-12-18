package cn.xys.command.appliance;

/**
 * @description: 家电类为接收者
 * @author: muLin
 * @time: 2021/5/7 15:13
 */
public class Light {
    String name;

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("灯打开");
    }
    public void off(){
        System.out.println("灯关闭");
    }
}
