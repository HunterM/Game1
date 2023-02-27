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

//    Состояние персонажа state = Stand по умолчанию
    protected String state;

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
        state = "Stand";
    }

    public int getSpeed() { return this.speed; }
    public float getHp () { return this.hp; }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) { }

//    Найти ближайшего противника
    protected int findNearest(ArrayList<Human> team){
        double min = Double.MAX_VALUE;
//        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }
//Определение повреждения и лечения
    protected void getDamage(float damage){
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }
    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }
}
