package menuService;

public class ExitMenu {
    public void exitGame(int userStepInRulesMenu) {
        if (userStepInRulesMenu == 3) {
            exit();
        }
    }
    public void exit(){
        System.out.println("гг");
        System.exit(0);
    }
}
