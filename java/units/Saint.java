package units;

import units.Human;

public abstract class Saint extends Human {
    protected int mana;
    protected int maxMana;
    public Saint(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }

//    public int healing (int damage, Human human){ return hp;}

}
