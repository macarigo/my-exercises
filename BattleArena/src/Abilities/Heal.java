package Abilities;

public class Heal extends AbstractAbility{
    public Heal(int abilityPower, int manaCost, int cooldown) {
        super(abilityPower, manaCost, cooldown);
    }

    @Override
    public int useAbility() {
        return 0;
    }
}
