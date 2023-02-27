package units;

public class Rouge extends Pehotinec {
    int disguise;

    public Rouge(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int disguise, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.disguise = disguise;
    }

    public Rouge(String name, Point2D coords) {
        super(name, 70.f, 70, 10, 2, 6, 7,
                6, coords.posX, coords.posY);
        this.disguise = 50;
    }

    public void steal(int disguise, Archer Archer) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Rouge.super.name)
                .append("\t| ATK:\t").append(Rouge.super.attack)
                .append("\t| HP:\t").append(Rouge.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Rouge.super.coords.posX).append(".").append(Rouge.super.coords.posY);
    }
}
