package cn.xys.state;

/**
 * @description: 状态接口
 * @author: xys
 * @date: 2023/5/26 11:16
 */
public interface State {
    /**
     * 投入硬币
     */
    void insertQuarter();

    /**
     * 退硬币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
