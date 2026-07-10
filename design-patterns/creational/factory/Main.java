package creational.factory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        try {
            Character player = characterFactory.create(CharacterType.FIGHTER, Role.PLAYABLE);
            Character fighterEnemy = characterFactory.create(CharacterType.FIGHTER, Role.COMPUTER);
            Character archerEnemy = characterFactory.create(CharacterType.ARCHER, Role.COMPUTER);

            player.attack(fighterEnemy);
            archerEnemy.attack(player);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
