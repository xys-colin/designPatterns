package cn.xys.composite;

import java.util.ArrayList;
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

}
