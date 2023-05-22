package cn.xys.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * @description:
 * @author: xys
 * @date: 2023/5/19 16:43
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) return false;
        Iterator<MenuComponent> iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public MenuComponent next() {
        if (hasNext()){
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof  Menu){
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }
}
