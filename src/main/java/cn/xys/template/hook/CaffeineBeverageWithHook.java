package cn.xys.template.hook;

/**
 * @description: 钩子是一种被声明在抽象类中的方法，但只有空的或者默认的实现。
 * 钩子的存在，可以让子类有能力对算法的不同点进行挂钩。要不要挂钩，由子类自行决定
 * @author: muLin
 * @time: 2021/5/12 11:45
 */
public abstract class CaffeineBeverageWithHook {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
        addCondiments();
    }
    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Boiling Water");
    }

    private void boilWater() {
        System.out.println("Pouring into cup");
    }

    /**
     * 默认不做事的方法，我们称之为钩子，子类可以视情况覆盖这个方法
     * 钩子是一种被声明在抽象类中的方法，只有空的或者默认的实现的，钩子的存在可以让子类有能力对算法的不同点
     * 进行挂钩。要不要挂钩，由子类自行决定。
     * @return true
     */
    boolean customerWantsCondiments(){
        return true;
    }
}
