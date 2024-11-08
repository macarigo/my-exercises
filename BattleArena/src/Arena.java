import Heros.Cleric;
import Heros.Mage;
import Heros.Rogue;
import Heros.Warrior;
import Heros.Hero;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    List<Hero> heroes = new ArrayList<>();


    public void start() {
        Mage mage = new Mage();
        heroes.add(mage);
        Cleric cleric = new Cleric();
        heroes.add(cleric);
        Rogue rogue = new Rogue();
        heroes.add(rogue);
        Warrior warrior = new Warrior();
        heroes.add(warrior);
        TurnManager turnManager = new TurnManager(this);
    }

    public List<Hero> getHeroes() {
        return heroes;
    }
}
