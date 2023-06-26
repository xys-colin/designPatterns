package cn.xys.state;

/**
 * @description:
 * @author: xys
 * @date: 2023/6/21 15:09
 */
public class SoldState implements State{
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {

    }
}
