package cn.xys.observer.internal;

import cn.xys.observer.customed.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/28 21:42
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+ humidity+"% humidity");
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData= (WeatherData) o;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }
}
