package units;

public class Prist extends Saint{
    public Prist(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                int defense, int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, mana, maxMana, posX, posY);

    }
    public Prist(String name, Point2D coords) {
        super(name, 50.f, 50, 10, -7, -7, 3,
                7, 5 ,5, coords.posX, coords.posY);

    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Прист:  \t").append(Prist.super.name)
                .append("\t| ATK:\t").append(Prist.super.attack)
                .append("\t| HP:\t").append(Prist.super.hp)
                .append(" \t| MP:\t").append(Prist.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Prist.super.coords.posX).append(".").append(Prist.super.coords.posY);
    }
}
