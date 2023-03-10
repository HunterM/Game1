package units;

import java.util.ArrayList;

public abstract class Human implements inGameInterface {
    protected String name;
    protected float hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;
    protected Point2D coords;
    protected String state;
    protected static int heroCnt;

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + coords.posX +
                " A:" + coords.posY +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                " " + state;
    }

    public int[] getCoords() {return new int[]{coords.posX, coords.posY};}

    protected Human(String name, float hp, int maxHp, int attack, int damageMin,
                    int damageMax, int defense, int speed, int posX, int posY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        coords = new Point2D(posX, posY);
        state = "Ходит";
        heroCnt++;
    }

    public int getSpeed() { return speed;}
    public float getHp() { return hp;}
    @Override
    public boolean step(ArrayList<Human> team1, ArrayList<Human> team2) {
        return false;
    }
    public int findNearest(ArrayList<Human> team){
        int index = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords) && !team.get(i).state.equals("Мертвяк")) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    protected void getDamage(float damage){
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Мертвяк";
        }
        if (hp > maxHp) hp = maxHp;
    }
    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }

}
