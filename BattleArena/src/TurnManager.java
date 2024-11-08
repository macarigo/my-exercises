import Heros.Hero;

import java.util.Iterator;
import java.util.List;


public class TurnManager {
    private int currentTurn;
    private final Arena arena;
    private List<Hero> remainingHeroes;


    public TurnManager(Arena arena) {
        this.arena = arena;
        this.currentTurn = 1;
        takeTurn();
        System.out.println(remainingHeroes);
    }

    public void takeTurn() { // select random hero to use ability/attack. Cycle through all heroes and increment currentTurn.
        while (heroesAlive()) {
            System.out.println("    -----   Turn " + currentTurn + "     -----");
            combat();
            System.out.println(remainingHeroes);
            System.out.println("    -----   Current State     -----");
            currentState();
            currentTurn++;
        }
    }

        /*if (mana > manaCost) { // change mana for getCurrentMana
            heroes.get(randomHero).useAbility();
            currentMana -= manaCost;
        }*/


    private List<Hero> combat() {
        Iterator<Hero> iterator = remainingHeroes.iterator();
        for (attacker:
             remainingHeroes) {

            Hero attacker = attackerSelector();
            Hero target = targetSelector();
            while (target == attacker) {
                targetSelector();
            }
            attacker.useAttack(target);
            int hit = Math.abs(target.getDefensePower() - attacker.getAttackPower());
            target.setHealth(hit);
            System.out.println(attacker + " attacked " + target + " dealing " + hit + " damage. " + target + "'s health is " + target.getHealth());
            if (isDead(target)) {
                iterator.remove();
                System.out.println(target + " has died");
            }
        }
        return remainingHeroes;
    }

    private Hero attackerSelector() {
        List<Hero> heroes = arena.getHeroes();
        int attacker = (int) (Math.random() * heroes.size());
        return heroes.get(attacker);
    }

    private Hero targetSelector() {
        List<Hero> heroes = arena.getHeroes();
        int target = (int) (Math.random() * heroes.size());
        return heroes.get(target);
    }

    private boolean heroesAlive() {
        remainingHeroes = arena.getHeroes();
        int aliveHeroes = (int) remainingHeroes.stream()
                .filter(hero -> hero.getHealth() > 0)
                .count();
        return aliveHeroes >= 1;
    }

    private void currentState() {
        remainingHeroes = arena.getHeroes();
        for (Hero hero : remainingHeroes) {
            hero.getHealth();
            System.out.println(hero + " health is " + hero.getHealth());
        }
        System.out.println(remainingHeroes);
    }

    private boolean isDead(Hero hero) {
        if (hero.getHealth() <= 0) {
            return true;
        }
        return false;
    }
}