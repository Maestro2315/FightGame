package menuService;

import modules.Fighter;
import services.fileService.JsonParser;
import services.fileService.JsonParserService;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class StartGameMenu {
    Scanner sc = new Scanner(System.in);
    JsonParserService jsonObj = new JsonParserService();

    public Fighter chooseFighter() {
        jsonObj.getFighters("Fighter.json");
        System.out.println("To choose fighter, enter him number");
        String numberFighter = sc.nextLine();
        System.out.println(numberFighter + "1.Спартанец \n 2.Секутор \n 3.Провокатор \n 4.Андабат");
        List<Fighter> list = jsonObj.getFighters("Fighter.json");
        for (Fighter fighter : list) {
            if (fighter.getName().equals(numberFighter)) {
                System.out.println("You chose");
                return fighter;
            }
        }
        System.out.println("Unknown fighter");
        return null;
    }


}
