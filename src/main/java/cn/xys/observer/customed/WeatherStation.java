package cn.xys.observer.customed;

/**
 * @description: 观察者模式——在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知并自动更新。
 * @author: muLin
 * @time: 2021/4/28 21:02
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
