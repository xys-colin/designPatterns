package cn.xys.command;

/**
 * @description: 调用者
 * @author: muLin
 * @time: 2021/5/7 16:15
 */
public class RemoteControl {
    //遥控器处理7个开与关的命令，使用相应数组记录这些命令
    Command[] onCommands;
    Command[] offCommands;

    //只需要实例化并初始化这两个开与关的数组
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }
    public void setCommands(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot "+i+"] "+onCommands[i].getClass().getSimpleName()+"  "+offCommands[i].getClass().getSimpleName()+"\n");
        }
        return stringBuffer.toString();
    }
}
