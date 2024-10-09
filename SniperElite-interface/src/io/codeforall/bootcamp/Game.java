package io.codeforall.bootcamp;

import io.codeforall.bootcamp.gameobject.Barrel;
import io.codeforall.bootcamp.gameobject.Destroyable;
import io.codeforall.bootcamp.gameobject.GameObject;
import io.codeforall.bootcamp.gameobject.GameObjectFactory;
import io.codeforall.bootcamp.gameobject.decor.Tree;
import io.codeforall.bootcamp.gameobject.enemy.Enemy;
import io.codeforall.bootcamp.gameobject.weapons.SniperRifle;

/**
 * Sniper Elite
 */
public class Game {

    public static final double ENEMY_PROBABILITY = 0.7;
    public static final int BULLET_DAMAGE = 1;

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;

    /**
     * Construct the game
     *
     * @param numberObjects the number of game objects to create
     */
    public Game(int numberObjects) {

        this.gameObjects = createGameObjects(numberObjects);
        this.sniperRifle = new SniperRifle(BULLET_DAMAGE);

    }

    /**
     * Start shooting
     */
    public void start() {

        for (int i = 0; i < gameObjects.length; i++) {

            System.out.println(gameObjects[i].getMessage());

            if (gameObjects[i] instanceof Destroyable) {

                Destroyable target = (Destroyable) gameObjects[i];
                while (!target.isDestroyed()) {

                    System.out.println("Making the shot...");
                    sniperRifle.shoot(target);

                }


                if (Math.random() < 0.5 && gameObjects[i] instanceof Barrel) {

                    System.out.println("A fire started");

                    for(int j = 1; j < 3; j++) {
                        gameObjects[i + j].burn();
                    }
                }

                System.out.println("Target is neutralized. I repeat, Target is neutralized!");

            }
        }

        System.out.println("All targets are down. I repeat all targets are down. " + sniperRifle.getShotsFired() + " shots.");
    }

    private GameObject[] createGameObjects(int numberObjects) {

        GameObject[] gameObjects = new GameObject[numberObjects];

        for (int i = 0; i < gameObjects.length; i++) {

            gameObjects[i] = Math.random() < ENEMY_PROBABILITY ? GameObjectFactory.createDestroyable() : new Tree();

        }

        return gameObjects;

    }

}