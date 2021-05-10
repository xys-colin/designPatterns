package cn.xys.command;

/**
 * 命令接口
 */
public interface Command {
    void execute();
    //撤销命令
    //如果一个命令的execute()方法执行了，undo()只需要调用与execute中相反的动作
    void undo();
}
