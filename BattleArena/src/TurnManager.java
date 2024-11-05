import Heros.Hero;

import java.util.List;


public class TurnManager {
    private int currentTurn = 0;
    private Arena arena;

    public TurnManager(Arena arena) {
        this.arena = arena;
    }

    public void takeTurn() { // select random hero to use ability/attack. Cycle through all heroes and increment currentTurn.
        List<Hero> heroes = arena.getHeroes();
        int randomHero = (int) (Math.random() * heroes.size());
        /*if (mana > manaCost) { // change mana for getCurrentMana
            heroes.get(randomHero).useAbility();
            currentMana -= manaCost;
        }*/
        heroes.get(randomHero).useAttack();
        currentTurn++;
    }

}
