package units;

import java.util.ArrayList;

public abstract class Archer extends Human {
    protected int range;
    protected int cartridges;

    protected Archer(String name, float hp, int maxHp, int attack, int damageMin,
                     int damageMax, int defense, int speed, int cartridges,
                     int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.cartridges = cartridges;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Умер") || cartridges == 0) return;
//        условие либо умер либо нет стрел покидает State

        Human victim = team2.get(findNearest(team2));
//        Поиск ближайшего врага
            float damage = (victim.defense - attack) > 0 ? damageMin : (victim.defense - attack) < 0 ? damageMax : (damageMin + damageMax) / 2;
            victim.getDamage(damage);
        for (Human human : team1) {
            if (human.getInfo().toString().split(":")[0].equals("Фермер") && human.state.equals("Stand")) {
                human.state = "Занят";
                return;
            }
        }
        cartridges--;
    }
}
