import menuService.SimpleStartMenu;
import menuService.StartGameMenu;
import modules.Fighter;
import modules.FightersConfig;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        StartMenu startMenu = new StartMenu();
//        startMenu.startMenuService();
//        System.out.println(startMenu);
//        ActionMenu actionMenu = new ActionMenu();
//        System.out.println(actionMenu);
//
//
//        SimpleStartMenu startMenu = new SimpleStartMenu();
//        startMenu.runMainMenu();               //метод вызова начальной менюшки
//
        StartGameMenu startGameMenu = new StartGameMenu();
        startGameMenu.chooseFighter();


    }

}
