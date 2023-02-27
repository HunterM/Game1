package units;

import units.Pehotinec;
import units.Point2D;

public class Pikiner extends Pehotinec {
    public Pikiner(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }

    public Pikiner(String name, Point2D coords) {

        super(name, 70.f, 70, 10, 2, 4, 10,
                6, coords.posX, coords.posY);
    }

    public void runAway() {    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Pikiner.super.name)
                .append("\t| ATK:\t").append(Pikiner.super.attack)
                .append("\t| HP:\t").append(Pikiner.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Pikiner.super.coords.posX).append(".").append(Pikiner.super.coords.posY);
    }
}
