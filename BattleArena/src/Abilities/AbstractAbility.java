package Abilities;

public abstract class AbstractAbility implements Ability{
    private int abilityPower;
    private int manaCost;
    private int cooldown;
    
    public AbstractAbility(int abilityPower, int manaCost, int cooldown) {
        this.abilityPower = abilityPower;
        this.manaCost = manaCost;
        this.cooldown = cooldown;
    }    
    
    public int getAbilityPower() {
        return abilityPower;
    }
    
    public int getManaCost() {
        return manaCost;
    }
    
    public int getCooldown() {
        return cooldown;
    }

    public abstract int useAbility();
}
