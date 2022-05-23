package menuService;

import modules.Fighter;
import modules.FightersConfig;
import services.fileService.JsonParser;
import java.util.List;
import java.util.Scanner;

public class StartGameMenu {
    Scanner sc = new Scanner(System.in);
    JsonParser jsonObj = new JsonParser();
    FightersConfig fightersConfig = new FightersConfig();

public void showFighter(){
    System.out.println(fightersConfig.getFighter());
}

public List<Fighter> getFighters(){
    jsonObj.getFighters("Fighter.json");
    return fightersConfig.getFighter();
}

    public Fighter chooseFighter() {
        showFighter();
        jsonObj.getFighters("Fighter.json");
        System.out.println("To choose fighter, enter him number");
        String numberFighter = sc.nextLine();
        System.out.println(numberFighter + "1.Спартанец \n 2.Секутор \n 3.Провокатор \n 4.Андабат");
        List<Fighter> list = getFighters();
        for (Fighter fighters : list) {
            if (fighters.getName().equals(numberFighter)) {
                System.out.println("Youre chose");
                return fighters;
            }
        }
        System.out.println("Unknown fighter");
        return null;
    }


}
