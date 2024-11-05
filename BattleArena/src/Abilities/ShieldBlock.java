package Abilities;

public class ShieldBlock extends AbstractAbility{
    public ShieldBlock(int abilityPower, int manaCost, int cooldown) {
        super(abilityPower, manaCost, cooldown);
    }

    @Override
    public int useAbility() {
        return 0;
    }
}
