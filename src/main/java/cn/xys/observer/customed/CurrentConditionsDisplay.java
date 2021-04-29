package cn.xys.observer.customed;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/28 20:46
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    //以防要取消注册，可以删除
    private Subject subject;
    public CurrentConditionsDisplay(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+ humidity+"% humidity");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
}
