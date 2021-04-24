package cn.xys.singleton.type6;

/**
 * @description: 静态内部类
 * 采用了类装载的机制来保证初始化实例时只有一个线程
 * 静态内部类方式在Singleton类被装载时并不会立即实例化,而是在需要实例化时
 * ,调用getInstance方法,才会装载SingletonInstance类,从而完成Singleton的实例化.
 * 类的静态属性只会在第一次加载类的时候初始化,所以在这里,JVM帮助我们保证了线程安全性,在类进行初始化时,别的线程是无法进入的
 * 优点:避免了线程不安全,利用静态内部类特点实现延迟加载,效率高
 * @author: muLin
 * @time: 2021/4/24 17:52
 */
public class SingletonTest06 {

}
class Singleton{
    private static volatile Singleton instance;
    private Singleton(){

    }
    private static class SingletonInstance{
        private static final Singleton SINGLETON=new Singleton();
    }
    public static synchronized Singleton getInstance(){
        return SingletonInstance.SINGLETON;
    }
}
