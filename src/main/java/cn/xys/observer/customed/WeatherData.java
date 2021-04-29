package cn.xys.observer.customed;

import java.util.ArrayList;

/**
 * @description: 主题具体实现类
 * @author: muLin
 * @time: 2021/4/28 20:30
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList<Observer>();
    }
    /**
     * 注册观察者
     * @param o 观察者
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 观察者取消注册
     * @param o 观察者
     */
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * 将状态通知观察者
     */
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer=observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当气象数据更新通知观察者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     *  模拟天气数据
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }


}
