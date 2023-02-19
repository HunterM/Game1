package units;

public abstract class Saint extends Human{
    protected int shots, maxShots;
    protected String name;

    public Saint(int ataka, int deff, int uron, int health, int speed,int mana, String name) {
        super(ataka, deff, uron, health, speed, mana);
        this.ataka = ataka;
        this.deff = deff;
        this.uron = uron;
        this.health = health;
        this.speed = speed;
        this.mana = mana;
        this.name = name;
    }

//    public int getAttak(){
//        return super.ataka;
//    }
}

