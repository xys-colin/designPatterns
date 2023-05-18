package cn.xys.composite;

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
}
