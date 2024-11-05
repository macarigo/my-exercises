package Abilities;

public class SneakAttack extends AbstractAbility{
    public SneakAttack(int abilityPower, int manaCost, int cooldown) {
        super(abilityPower, manaCost, cooldown);
    }

    @Override
    public int useAbility() {
        return 0;
    }
}
