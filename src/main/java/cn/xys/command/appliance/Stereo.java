package cn.xys.command.appliance;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/7 17:07
 */
public class Stereo {
    public void on(){
        System.out.println("Stereo is on");
    }
    public void off(){
        System.out.println("Stereo is off");
    }
    public void setCD(){

    }
    public void setVolume(int level){
        System.out.println(level);
    }
}
