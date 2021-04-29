package cn.xys.observer.internal;

import java.util.Observable;

/**
 * @description: java内置观察者模式
 * @author: muLin
 * @time: 2021/4/28 21:35
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged(){
        //标记状态已经改变的事实
        setChanged();
        //没有使用带参数的，证明观察者使用的是“拉”，反之亦然
        notifyObservers();
    }
    /**
     *  模拟天气数据
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压强s
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    /**
     * 因为使用的是“拉” 的做法，所以才需要getter方法，观察者会利用这些方法取得WeatherData对象的状态
     * @return
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
