package creational.abstract_factory;

class Fighter extends Character {
    public Fighter(Role role) {
        super(role);
    }

    @Override
    void setWeapon(Weapon weapon) throws Exception {
        if (!(weapon instanceof Sword)) {
            throw new Exception(
                    String.format("[%s] Could not handle %s", this.getClass().getSimpleName(),
                            weapon.getClass().getSimpleName()));
        }

        this.weapon = weapon;
    }

    @Override
    void attack(Character enemy) throws Exception {
        if (this.weapon == null) {
            throw new Exception(String.format("[%s] No weapon", this.getClass().getSimpleName()));
        }

        try {
            System.out.printf("[%s] %s attacks [%s] %s\n", this.role.name(),
                    getClass().getSimpleName(),
                    enemy.getRole().name(), enemy.getClass().getSimpleName());
            enemy.takeDamage(this.weapon.getDamage());
        } catch (Exception ex) {
            System.out.printf("[%s] %s killed [%s] %s\n", this.role.name(),
                    getClass().getSimpleName(),
                    enemy.getRole().name(), enemy.getClass().getSimpleName());
        }
    }
}
