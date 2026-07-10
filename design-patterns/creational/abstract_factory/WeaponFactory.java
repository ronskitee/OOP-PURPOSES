package creational.abstract_factory;

class WeaponFactory {
    public Weapon create(WeaponType type) throws Exception {
        switch (type) {
            case WeaponType.SWORD:
                return new Sword();
            case WeaponType.BOW:
                return new Bow();
            case WeaponType.WAND:
                return new Wand();
            default:
                throw new Exception("Invalid enemy type");
        }
    }
}
