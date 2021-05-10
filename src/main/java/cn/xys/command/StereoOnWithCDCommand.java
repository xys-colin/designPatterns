package cn.xys.command;

import cn.xys.command.appliance.Stereo;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/7 17:06
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo() {
        stereo.off();
    }
}
