package cn.xys.facade;

import cn.xys.facade.media.*;

/**
 * @description: 外观接口
 * @author: muLin
 * @time: 2021/5/11 11:56
 */
public class HomeTheaterFacade {
    //使用组合,将子系统组件引入
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    Projector projector;
    CdPlayer cd;

    /**
     * 外观将子系统中每一个组件的引用都传入它的构造器中. 然后外观将他们赋值给相应的实例变量
     * @param amp
     * @param tuner
     * @param dvd
     * @param projector
     * @param cd
     */
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector, CdPlayer cd) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.projector = projector;
        this.cd = cd;
    }

    public HomeTheaterFacade() {
    }

    public void watchMovie(){
        //把我们之前手动进行的每项任务依次处理. 每项处理任务可委托子系统中相应的组件处理的,也可以在此基础上附加功能
    }
}
