package cn.xys.state;

/**
 * @description: 糖果机
 * @author: xys
 * @date: 2023/5/26 15:57
 */
public class GumballMachine {
    // 售停
    State soldOutState;
    // 无硬币
    State noQuarterState;
    // 有硬币
    State hasQuarterState;
    // 售出
    State soldState;

    State state=soldOutState;
    int count =0;

    public GumballMachine(int numberGumballs) {

        this.count = count;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void setState(State state){
        this.state=state;
    }
    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if (count!=0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }
}
