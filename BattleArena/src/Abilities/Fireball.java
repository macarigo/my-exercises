package Abilities;

public class Fireball extends AbstractAbility{
    public Fireball() {
        super(20, 10, 5);
    }

    @Override
    public int useAbility() {
        //int damage = attackPower - defensePower;
        return 0;
    }
}
