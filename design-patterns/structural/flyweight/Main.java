package structural.flyweight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        EnemyFactory virusFactory = new EnemyFactory();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            List<Integer> virusLocation = Arrays.asList(random.nextInt(3) + 1, random.nextInt(3) + 1);
            Enemy virus = virusFactory.generate(virusLocation);
            virus.attack(player);
        }
    }
}

abstract class Character {
    public abstract void move(List<Integer> point);

    public abstract void attack(Character target);
}

class Player extends Character {
    private List<Integer> point = Arrays.asList(0, 0);

    @Override
    public void move(List<Integer> point) {
        this.point = point;
    }

    @Override
    public void attack(Character target) {
        System.out.println("Player#" + System.identityHashCode(this) +
                " Attacking enemy " + System.identityHashCode(target) +
                " from location " + point);
    }
}

class Enemy extends Character {
    private List<Integer> point = Arrays.asList(0, 0);

    @Override
    public void move(List<Integer> point) {
        this.point = point;
    }

    @Override
    public void attack(Character target) {
        System.out.println("Enemy#" + System.identityHashCode(this) +
                " Attacking character " + System.identityHashCode(target) +
                " from location " + point);
    }
}

class EnemyFactory {
    private Map<String, Enemy> enemyStates = new HashMap<>();

    public Enemy generate(List<Integer> point) {
        String key = point.get(0) + "," + point.get(1);

        if (!enemyStates.containsKey(key)) {
            Enemy newEnemy = new Enemy();
            newEnemy.move(point);
            enemyStates.put(key, newEnemy);
        }

        return enemyStates.get(key);
    }
}
