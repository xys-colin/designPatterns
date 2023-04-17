package cn.xys.iterator;

import java.util.ArrayList;

/**
 * @description:
 * @author: xys
 * @date: 2023/3/30 15:16
 */
public class PancakeHouseIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    /**
     * 记录当前数组遍历的位置
     */
    int position=0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position<items.size();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
