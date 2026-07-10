package creational.abstract_factory;

class CharacterFactory {
    public Character create(CharacterType type, Role role) throws Exception {
        switch (type) {
            case CharacterType.ARCHER:
                return new Archer(role);
            case CharacterType.FIGHTER:
                return new Fighter(role);
            default:
                throw new Exception("Invalid enemy type");
        }
    }
}
