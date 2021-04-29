package cn.xys.observer.customed;

/**
 * 观察者接口
 */
public interface Observer {
    void update(float temp,float humidity,float pressure);
}
