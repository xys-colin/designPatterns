package cn.xys.singleton.type5;

/**
 * @description: 双重检查
 * 实例化代码只用执行一次,后面再次访问时,判断if,直接return实例化对象,也避免了反复进行方法同步
 * 线程安全; 延迟加载; 效率较高
 * 推荐使用这种单例模式
 * @author: muLin
 * @time: 2021/4/24 17:34
 */
public class SingletonTest05 {

}

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    //synchronized解决线程不安全
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }
}
