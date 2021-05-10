package cn.xys.command;

import cn.xys.command.appliance.Light;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/7 15:05
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
