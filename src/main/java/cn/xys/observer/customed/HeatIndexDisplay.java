package cn.xys.observer.customed;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/28 21:07
 */
public class HeatIndexDisplay implements Observer,DisplayElement {
    private double hi;
    public HeatIndexDisplay(Subject subject){
        subject.registerObserver(this);
    }
    public void display() {
        System.out.println("Heat index is "+ hi);
    }

    public void update(float temp, float humidity, float pressure) {
        heatIndexCal(temp,humidity);
        display();
    }
    private void heatIndexCal(float T,float RH){
        hi=-42.379 + 2.04901523*T + 10.14333127*RH - 0.22475541*T*RH - 0.00683783*T*T - 0.05481717*RH*RH + 0.00122874*T*T*RH + 0.00085282*T*RH*RH - 0.00000199*T*T*RH*RH;
    }
}
