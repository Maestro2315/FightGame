package menuService;

import services.fileService.TextReader;
import services.message.InputMessageService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RulesMenu {

    InputMessageService start = new InputMessageService();


    public void showRules() throws IOException {

        TextReader textReader = new TextReader();
        textReader.TextReaderFile();

        Scanner sc = new Scanner(System.in);

        InputMessageService exit = new InputMessageService();
        ExitMenu exitMenu = new ExitMenu();

        exit.print("\n Для того чтобы покинуть игру введите 1.");
        start.print("Чтобы вернуться назад в меню нажмите 2.");

        int userStepInRulesMenu = sc.nextInt();
        if (userStepInRulesMenu == 1) {
            exitMenu.exit();
        }
        backToStartMenu(userStepInRulesMenu);


    }

    public void backToStartMenu(int command) throws IOException {
        start.print("Чтобы вернуться назад в меню нажмите 2)");
        if (command == 2) {
            StartMenu startMenu = new StartMenu();
            startMenu.startMenuService();
        }
    }


    //TODO метод для вывода вариантов выбора для юзера по типу вернуться в меню и тд)

    //TODO метод из файлсервиса который считывает тхт файл

//    private void textRules() {
//        try {
//            new InputMessageService().print(new TextReader().TextReaderFile());
//        } catch (IOException e) {
//            new InputMessageService().print(e.getMessage());
//        }
//    }

}
