package creational.factory;

class Archer extends Character {
    public Archer(Role role) {
        super(role);
    }

    @Override
    void attack(Character enemy) {
        try {
            enemy.takeDamage(15);
        } catch (Exception ex) {
            System.out.printf("[%s] %s killed [%s] %s\n", this.role.name(), getClass().getSimpleName(),
                    enemy.getRole().name(), enemy.getClass().getSimpleName());
        }
    }
}