package cn.xys.command;

import cn.xys.command.appliance.CeilingFan;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/10 17:39
 */
public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    //记录吊扇之前的速度
    int preSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        //在我们改变吊扇的速度之前，需要先将它之前的状态记录起来，以便需要撤销使用
        preSpeed=ceilingFan.getSpeed();
        ceilingFan.low();
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
