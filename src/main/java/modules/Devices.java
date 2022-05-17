package modules;

public class Devices {
    String name;
    float attack;
    float defence;

    public Devices(String name, float attack, float defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAttack() {
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    public float getDefence() {
        return defence;
    }

    public void setDefence(float defence) {
        this.defence = defence;
    }
}
