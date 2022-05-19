package modules;

public class Fighter {
    String name;
    int hp;
    float attackSkill;
    float defenceSkill;

    public Fighter(String name, int hp, float attackSkill, float defenceSkill) {
        this.name = name;
        this.hp = hp;
        this.attackSkill = attackSkill;
        this.defenceSkill = defenceSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public float getAttackSkill() {
        return attackSkill;
    }

    public void setAttackSkill(float attackSkill) {
        this.attackSkill = attackSkill;
    }

    public float getDefenceSkill() {
        return defenceSkill;
    }

    public void setDefenceSkill(float defenceSkill) {
        this.defenceSkill = defenceSkill;
    }
}
