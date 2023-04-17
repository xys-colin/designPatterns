package cn.xys.iterator;

/**
 * @description:
 * @author: xys
 * @date: 2023/3/30 15:01
 */
public class DinerMenuIterator implements Iterator<MenuItem>{
    MenuItem[] items;
    /**
     * 记录当前数组遍历的位置
     */
    int position=0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
