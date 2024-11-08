package Heros;

public class Hero {
    private int health;
    private int attackPower;
    private int defensePower;
    private int mana;
    private String name;

    public Hero(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 50;
        attackPower = 30;
        defensePower = 10;
    }

    public int useAttack(Hero hero) {
        int damage = attackPower - defensePower; // change defensePower for getTargetDefense
        return damage;
    }

    public int useAbility() {
        if (this.mana < 0){ // change 0 for getManaCost
            System.out.println("Insufficient mana!");
        }
        int criticalDamage = (attackPower * 5) - defensePower; // change defensePower for getTargetDefense
        return criticalDamage;
    }
    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setHealth(int damage) {
        this.health -= damage;
    }
}
