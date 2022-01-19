package cn.xys.template;

/**
 * @description: 该类专注于在算法本身，而由子类提供完整的实现
 * @author: muLin
 * @time: 2021/5/12 11:13
 */
public abstract class CaffeineBeverage {

    /**
     * 模板方法，final防止子类重写，可以让其他的咖啡因饮料插进来。新的咖啡因饮料只需要实现自己的方法就可以了。
     * 模板就是一个方法，这个方法将算法定义成一组步骤，其中的任何步骤都可以是抽象的，由子类负责实现。这样就可以确保算法的结构保持不变，同时由子类提供部分实现
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
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
}
