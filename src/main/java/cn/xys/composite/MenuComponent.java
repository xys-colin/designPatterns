package cn.xys.composite;

import java.util.Iterator;

/**
 * @description: 菜单组件
 * @author: xys
 * @date: 2023/4/18 15:59
 */
public interface MenuComponent {
    default void add(MenuComponent menuComponent) {}

    default void remove(MenuComponent menuComponent){}

    default MenuComponent getChild(int i){
        return null;
    }

    default String getName(){
        return null;
    }

    default String getDescription(){
        return null;
    }

    default double getPrice() {
        return 0;
    }

    default boolean isVegetarian() {
        return false;
    }

    default void print() {

    }
    default Iterator<MenuComponent> createIterator(){
        return null;
    }
}
