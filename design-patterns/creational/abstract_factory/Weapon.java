package creational.abstract_factory;

abstract public class Weapon {
    protected int damage = 0;

    public Weapon(int damage) {
        this.damage = damage;
    }

    protected int getDamage() {
        return this.damage;
    }
}
