package units;

import java.util.ArrayList;

public class XBowMan extends Archer {

    protected XBowMan(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
                          int speed, int cartridges, int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, cartridges, range, posX, posY);
    }

    public XBowMan(String name, Point2D coords) {
        super(name, 60.f, 60, 7, 3, 7, 4,
                9, 20, 10, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(XBowMan.super.name)
                .append("\t| ATK:\t").append(XBowMan.super.attack)
                .append("\t| HP:\t").append(XBowMan.super.hp)
                .append(" \t| Arrows:").append(XBowMan.super.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(XBowMan.super.coords.posX).append(".").append(XBowMan.super.coords.posY);
    }
}
