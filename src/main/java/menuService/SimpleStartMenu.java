package menuService;


import gamePlay.Fight;
import services.message.InputMessageService;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class SimpleStartMenu implements StartMenu {

    private final InputMessageService start = new InputMessageService();
    private final Scanner sc = new Scanner(System.in);
    private final ExitMenu exitMenu = new ExitMenu();
    private final Fight fight = new Fight();
    private final StartGameMenu chooseMenu = new StartGameMenu();

    //TODO для всех сервисов сделать интерфейсы и подумать про паблик прайвит
    
    public void runMainMenu() {
        start.print("Добро пожаловать воин, не хочешь сразиться в дуэли? :)");
        start.print("1. Правила");
        start.print("2. Начать играть");
        start.print("3. Выйти");

        int userStepInRulesMenu = sc.nextInt();
        run(userStepInRulesMenu);

    }

    private void run(int command) {
        try {
            runRuleMenu(command);
            startGame(command);
            exitMenu.exit();

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);  // Суперкласc исключений, которые могут возникать во время нормальной работы виртуальной машины Java.
                                            // Любые подклассы RuntimeException, которые могут быть сгенерированы, но не пойманы во время выполнения метода.
        }
    }

    private void startGame(int command) throws IOException {
        if (command == 2) {
            fight.gogo();
        }
    }

    private void runRuleMenu(int command) throws IOException, URISyntaxException {
        RulesMenu rulesMenu = new RulesMenu();
        if (command == 1) {
            rulesMenu.showRules();
        }

    }


}

