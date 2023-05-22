package cn.xys.composite;

/**
 * @description:
 * @author: xys
 * @date: 2023/5/18 10:16
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        Menu dinerMenu = new Menu("DINER MENU", "Lunch");
        Menu cafeMenu = new Menu("CAFE MENU", "Dinner");
        Menu dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        Menu allMenus = new Menu("ALL MENUS", "All ,menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey", true, 1.59));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
