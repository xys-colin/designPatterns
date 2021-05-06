package cn.xys.factory;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/25 15:12
 */
public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name+"baking;");
    }
    public void cut(){
        System.out.println(name+"cutting;");
    }
    public void box(){
        System.out.println(name+"boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
