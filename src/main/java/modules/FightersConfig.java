package modules;

import java.util.ArrayList;
import java.util.List;

public class FightersConfig implements FightersConfigOption {

    private String name;
    private List<Fighter> fighters;

    public FightersConfig(String name) {
        this.name = name;
        this.fighters = new ArrayList<>();
    }

    public FightersConfig(){}

    @Override
public void addFighter(Fighter fighter) {
        fighters.add(fighter);
}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fighter> getFighter() {
        return fighters;
    }

}
