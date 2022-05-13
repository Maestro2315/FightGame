package menuService;

import services.message.InputMessageService;

import java.io.IOException;
import java.util.Scanner;

public class RulesMenu {

    private void showRules() {
        Scanner sc = new Scanner(System.in);

        InputMessageService exit = new InputMessageService();
        ExitMenu exitMenu = new ExitMenu();

        exit.print("Для того чтобы покинуть игру введите 0.");

        int userStepInRulesMenu = sc.nextInt();
        if (userStepInRulesMenu == 0) {
            exitMenu.exitGame();
        }
    }

    //TODO метод для вывода вариантов выбора для юзера по типу вернуться в меню и тд)

    //TODO метод из файлсервиса который считывает тхт файл

//    private void textRules() {
//        try {
//            new InputMessageService().print(new TextFileService().getRulesFromTXT(filename:"дыр дыр"));
//        } catch (IOException e) {
//            new InputMessageService().print(e.getMessage());
//        }
//    }

}
