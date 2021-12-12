package cn.xys.command;

/**
 * @description: 宏命令，批量执行命令
 * @author: xys
 * @date: 2021/12/12 16:48
 */
public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
