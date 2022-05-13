package menuService;

import services.message.InputMessageService;

import java.io.IOException;
import java.util.Scanner;

public class ActionMenu {

    public void actionMenu() throws IOException {
        InputMessageService go = new InputMessageService();
        go.enterNumber();



//            Scanner sc = new Scanner(System.in);
//    int userStep = sc.nextInt();
//        System.out.println("Для того чтобы отправится в бой введите 1, \n Для открытия правил введите 2\n Для выхода нажмите 3");
//
//           while(!(userStep ==1&&userStep ==3))
//
//    {
//        if (userStep == 2) {
//            showRules();
//        }
//        if (userStep == 1) {
//            startMenu();
//        }
//        if (userStep == 3) {
//            exitGame();
//        }
//        userStep = sc.nextInt();
//    }
//}
    }
}