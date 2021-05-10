package cn.xys.command;

import cn.xys.command.appliance.Light;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/7 17:04
 */
public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }
    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
