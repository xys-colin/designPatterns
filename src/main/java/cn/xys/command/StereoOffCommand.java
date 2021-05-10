package cn.xys.command;

import cn.xys.command.appliance.Stereo;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/10 17:33
 */
public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}
