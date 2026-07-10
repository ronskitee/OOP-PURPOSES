package creational.abstract_factory;

public abstract class Character {
    protected Role role;
    protected Weapon weapon = null;
    private int life = 100;

    public Character(Role role) {
        this.role = role;
    }

    abstract void attack(Character enemy) throws Exception;

    abstract void setWeapon(Weapon weapon) throws Exception;

    void takeDamage(int damage) throws Exception {
        System.out
                .printf("[%s] %s: Damaged by %d\n", this.role.name(), getClass().getSimpleName(), damage);
        this.life -= damage;

        if (this.life <= 0) {
            throw new Exception("Character died");
        }
    };

    Role getRole() {
        return this.role;
    }
}
