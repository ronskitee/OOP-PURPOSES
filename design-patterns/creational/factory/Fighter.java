package creational.factory;

public class Fighter extends Character {
    public Fighter(Role role) {
        super(role);
    }

    @Override
    void attack(Character enemy) {
        try {
            enemy.takeDamage(10);
        } catch (Exception ex) {
            System.out.printf("[%s] %s killed [%s] %s\n", this.role.name(), getClass().getSimpleName(),
                    enemy.getRole().name(), enemy.getClass().getSimpleName());
        }
    }
}
