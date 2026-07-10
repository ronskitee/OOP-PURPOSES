package creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        WeaponFactory weaponFactory = new WeaponFactory();

        try {
            Character player = characterFactory.create(CharacterType.FIGHTER, Role.PLAYABLE);
            player.setWeapon(weaponFactory.create(WeaponType.SWORD));

            Character fighterEnemy = characterFactory.create(CharacterType.FIGHTER,
                    Role.COMPUTER);
            fighterEnemy.setWeapon(weaponFactory.create(WeaponType.SWORD));

            Character archerEnemy = characterFactory.create(CharacterType.ARCHER,
                    Role.COMPUTER);
            archerEnemy.setWeapon(weaponFactory.create(WeaponType.BOW));

            player.attack(fighterEnemy);
            archerEnemy.attack(player);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
