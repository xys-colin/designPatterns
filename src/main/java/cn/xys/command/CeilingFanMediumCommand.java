package cn.xys.command;

import cn.xys.command.appliance.CeilingFan;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/10 19:54
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    //记录吊扇之前的速度
    int preSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        //在我们改变吊扇的速度之前，需要先将它之前的状态记录起来，以便需要撤销使用
        preSpeed=ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo() {
        if (preSpeed==CeilingFan.HIGH){
            ceilingFan.high();
        }else if (preSpeed==CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(preSpeed==CeilingFan.LOW){
            ceilingFan.low();
        }else if (preSpeed==CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
