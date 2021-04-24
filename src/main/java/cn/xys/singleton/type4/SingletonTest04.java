package cn.xys.singleton.type4;

/**
 * @description: 懒汉式(线程安全,同步方法)
 * 解决了线程不安全问题
 * 效率太低了,每个线程在想获得类的实例时候,执行getInstance()方法都要进行同步,而其实这个方法执行一次实例化代码就够了.
 * 不推荐
 * 还有一种类似的方式(线程不安全,同步代码块),不能使用
 * @author: muLin
 * @time: 2021/4/24 17:27
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode() + "\n" + singleton2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }
    //synchronized解决线程不安全
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        //同步代码块,线程不安全
//        if (instance==null){
//            synchronized (Singleton.class){
//                instance=new Singleton();
//            }
//        }
        return instance;
    }
}
