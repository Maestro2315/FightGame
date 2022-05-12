import java.util.Scanner;

public class StartMenu {


    public void startMenuService() {

        Scanner sc = new Scanner(System.in);
        int userStep = sc.nextInt();
        System.out.println("Для того чтобы отправится в бой введите 1, \n Для открытия правил введите 2\n Для выхода нажмите 3");

        while (!(userStep == 1 && userStep == 3)) {
            if (userStep == 2) {
                showRules();
            }
            if (userStep == 1) {
                startMenu();
            }
            if (userStep == 3) {
                exitGame();
            }
            userStep = sc.nextInt();
        }
    }
    //TODO ебать все нахуй переделать по видео чекнуть
    private void showRules() {
        Rules rules = new Rules();
        System.out.println(rules);
        Scanner sc = new Scanner(System.in);
        System.out.println("Для того чтобы покинуть игру нажмите 0, чтобы продолжить Enter");
        int userStepInRulesMenu = sc.nextInt();
        if (userStepInRulesMenu == 0) {
            exitGame();
        }
    }

    private void startMenu() {
        //Fight fight = new Fight();
        // Fight.start (Начать бой)
    }

    private void exitGame() {
        System.out.println("гг");
        System.exit(0);
    }
}


