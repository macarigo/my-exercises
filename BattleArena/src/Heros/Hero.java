package Heros;

public class Hero {
    private int health;
    private int attackPower;
    private int defensePower;
    private int mana;

    public Hero() {
        this.health = 100;
        this.mana = 50;
        attackPower = 20;
        defensePower = 10;
    }

    public int useAttack() {
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
}
