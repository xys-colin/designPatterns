package cn.xys.command;

/**
 * @description: 从remoteControl改进，加入了撤销undo操作
 * @author: muLin
 * @time: 2021/5/10 19:28
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    //记录前一个命令
    Command undoCommand;
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }
    public void setCommands(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
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
