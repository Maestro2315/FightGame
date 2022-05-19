import menuService.SimpleStartMenu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        StartMenu startMenu = new StartMenu();
//        startMenu.startMenuService();
//        System.out.println(startMenu);
//        ActionMenu actionMenu = new ActionMenu();
//        System.out.println(actionMenu);


        SimpleStartMenu startMenu = new SimpleStartMenu();
        startMenu.runMainMenu();               //метод вызова начальной менюшки
    }

}
