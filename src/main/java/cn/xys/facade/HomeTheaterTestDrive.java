package cn.xys.facade;

/**
 * @description: 外观模式:提供一个统一的接口,用来访问子系统中的一群接口. 外观定义了一个高层接口,让子系统更容易使用
 * 想要使用外观模式,我们创建一个接口简化而统一的类,用来包装子系统中一个或多个复杂的类, 外观模式允许我们让客户和子系统之间避免紧耦合
 * @author: xys
 * @date: 2021/12/18 22:33
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade();
        homeTheaterFacade.watchMovie();
    }
}
