package units;

public class Magic extends Saint{

    public Magic(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                 int defense, int speed, int mana, int maxMana, int posX, int posY ) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, mana, maxMana, posX, posY);
    }
    public Magic(String name, Point2D coords) {
        super(name, 50.f, 50, 9, -6, -6, 3,
                7, 5,5, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Маг: \t").append(Magic.super.name)
                .append("\t| ATK:\t").append(Magic.super.attack)
                .append("\t| HP:\t").append(Magic.super.hp)
                .append(" \t| MP:\t").append(Magic.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Magic.super.coords.posX).append(".").append(Magic.super.coords.posY);
    }
}
