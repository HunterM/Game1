package units;

import java.util.ArrayList;

public abstract class Archer extends Human {
    protected int range;
    protected int streli;

    protected Archer(String name, float hp, int maxHp, int attack, int damageMin,
                      int damageMax, int defense, int speed, int streli,
                      int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.streli = streli;
    }

    @Override
    public boolean step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Мертвяк") || streli == 0) return false;
        Human victim = team2.get(findNearest(team2));
        float damage = (victim.defense - attack)>0 ? damageMin : (victim.defense - attack)<0 ? damageMax : (damageMin+damageMax)/2;
        victim.getDamage(damage);
        for (Human human: team1) {
            if (human.getInfo().toString().split(":")[0].equals("Фермер") && human.state.equals("Живой")) {
                human.state = "Живой";
                return false;
            }
        }
        streli--;
        return false;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                " Shots:" + streli + " " +
                state;
    }

}
