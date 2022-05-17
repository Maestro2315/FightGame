package menuService;


import gamePlay.Fight;
import services.message.InputMessageService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StartMenu {

    InputMessageService start = new InputMessageService();
    Scanner sc = new Scanner(System.in);
    ExitMenu exitMenu = new ExitMenu();
    Fight fight = new Fight();

    public void startMenuService() {
        start.print("Добро пожаловать воин, не хочешь сразиться в дуэли? :)");
        start.print("1. Правила");
        start.print("2. Начать играть");
        start.print("3. Выйти");


        int userStepInRulesMenu = sc.nextInt();
        run(userStepInRulesMenu);

    }

    public void run(int command) {
        try {
            runRuleMenu(command);
            startGame(command);
            exitMenu.exit();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void startGame(int command) {
        if (command == 2) {
            fight.gogo();
        }
    }

    public void runRuleMenu(int command) throws IOException {
        if (command == 1) {
            RulesMenu rulesMenu = new RulesMenu();
            rulesMenu.showRules();
        }
    }

}


