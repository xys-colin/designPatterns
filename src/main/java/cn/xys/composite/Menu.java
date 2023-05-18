package cn.xys.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description: 组合菜单
 * @author: xys
 * @date: 2023/5/6 17:19
 */
public class Menu implements MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;
    public Menu(String name, String description){
        this.name=name;
        this.description=description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("--------------");
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
