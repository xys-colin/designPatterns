package cn.xys.command;

import cn.xys.command.appliance.CeilingFan;
import cn.xys.command.appliance.Light;
import cn.xys.command.appliance.Stereo;

/**
 * @description: 命令模式将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作
 * @author: muLin
 * @time: 2021/5/7 17:55
 */
public class RemoteLoader {
    public static void main(String[] args) {
        improveRemoteControl();
//        RemoteControl remoteControl = new RemoteControl();
//
//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//        Stereo stereo = new Stereo();
//        //创建命令
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);
//
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//        //将命令加载到遥控器插槽中
//        remoteControl.setCommands(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommands(1, kitchenRoomLightOn, kitchenRoomLightOff);
//        remoteControl.setCommands(2, stereoOnWithCD, stereoOff);
//
//        System.out.println(remoteControl);
//        //逐步按下每个插槽的开与关按钮
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
    }

    /**
     * 加入了撤销undo操作的遥控器测试
     */
    public static void improveRemoteControl(){
        RemoteControlWithUndo remoteControl=new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommands(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommands(1,ceilingFanLow,ceilingFanOff);
        remoteControl.setCommands(2,ceilingFanHigh,ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        //上一个命令是关闭，所以撤销是开启
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
