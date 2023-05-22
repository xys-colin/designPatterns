package cn.xys.composite;

import java.util.Iterator;

/**
 * @description:
 * @author: xys
 * @date: 2023/5/18 10:14
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            if (menuComponent.isVegetarian()) {
                menuComponent.print();
            }
        }
    }
}
