package units;

import units.Human;

public abstract class Pehotinec extends Human {

    public Pehotinec(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }

}
