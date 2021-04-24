package cn.xys.singleton.type1;

/**
 * @description: 饿汉式
 * * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * * 简单实用，推荐使用！
 * * 唯一缺点：不管用到与否，类装载时就完成实例化
 * * Class.forName("")
 * @author: muLin
 * @time: 2021/4/24 16:55
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode() + "\n" + singleton2.hashCode());
    }
}

/**
 * 饿汉式(静态变量)
 */
class Singleton {
    private Singleton() {

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
