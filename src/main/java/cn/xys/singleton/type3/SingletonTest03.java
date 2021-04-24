package cn.xys.singleton.type3;

/**
 * @description: 懒汉式
 * 起到懒加载的效果,但是只能在单线程下使用
 * 如果在多线程下,一个线程进入if判断语句块,还未来得及往下执行,另外一个线程也通过了这个判断语句,这时便会产生多个实例.
 * 所以在实际开发中,不要使用这种方式
 * @author: muLin
 * @time: 2021/4/24 17:18
 */
public class SingletonTest03 {
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

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}