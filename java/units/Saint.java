package units;

import units.Human;

import java.util.ArrayList;

public abstract class Saint extends Human {
    protected int mana;
    protected int maxMana;

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        for (Human human: team1) {
            if (human.hp < human.maxHp & !human.state.equals("Мертвяк")) {
                human.getDamage(damageMax);
                return;
            }
        }
    }

    public Saint(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }
}
