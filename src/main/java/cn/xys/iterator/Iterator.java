package cn.xys.iterator;

/**
 * @description: 迭代器接口
 *  迭代器模式提供一种方法顺序访问一个集合中的各个元素，而又不是暴露其内部的表示
 * @author: xys
 * @date: 2023/3/30 14:55
 */
public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 返回下一个元素
     * @return
     */
    T next();
}
