package cn.xys.singleton;

/**
 * @description: 枚举方式
 * 不仅能避免多线程同步问题,而且还能防止反序列化创建新的对象
 * @author: muLin
 * @time: 2021/4/24 20:02
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton=Singleton.INSTANCE;
        Singleton singleton1=Singleton.INSTANCE;
        System.out.println(singleton1.hashCode() + "\n" + singleton.hashCode());
    }
}
enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("~ok");
    }
}