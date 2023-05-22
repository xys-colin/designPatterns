package cn.xys.composite;


import java.util.Iterator;

/**
 * @description: 空迭代器
 * @author: xys
 * @date: 2023/5/22 15:40
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
