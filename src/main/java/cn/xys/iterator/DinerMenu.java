package cn.xys.iterator;

/**
 * @description:
 * @author: xys
 * @date: 2023/3/30 15:12
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
