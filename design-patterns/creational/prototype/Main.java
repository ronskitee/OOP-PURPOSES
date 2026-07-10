package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Enemy fighter1 = new Enemy(EnemyType.Fighter, 2);

        System.out.println(fighter1.getInfo());

        Enemy fighter2 = fighter1.clone();

        System.out.println(fighter2.getInfo());
    }
}

interface Prototype {
    Prototype clone();
}

enum EnemyType {
    Fighter,
    Mage,
    Archer,
}

class Enemy implements Prototype {
    private EnemyType type;
    private int level;

    public Enemy(EnemyType type, int level) {
        this.type = type;
        this.level = level;
    }

    public String getInfo() {
        return String.format("%s level %d", this.type.name(), this.level);
    }

    @Override
    public Enemy clone() {
        return new Enemy(this.type, this.level);
    }
}
