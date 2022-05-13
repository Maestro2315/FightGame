package menuService;


import GamePlay.Fight;
import services.message.InputMessageService;
import services.message.MessageService;

import java.io.IOException;

public class StartMenu {


    public void startMenuService() throws IOException {
        InputMessageService start = new InputMessageService();
        start.print("Добро пожаловать воин, не хочешь сразиться в дуэли? :)");
        start.enterNumber();

        if (){

        }

//        private void startMenu() {
//            Fight fight = new Fight();
//            Fight.start //(Начать бой)
//        }

        //TODO ебать все нахуй переделать по видео чекнуть
    }
}


