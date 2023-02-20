package units;

public abstract class Pehotinec extends Human{
    protected int shots, maxShots;
    protected String name;

    public Pehotinec(int ataka, int deff, int uron, int maxUron, int health, int speed, int delivery, String name) {
        super(ataka, deff, uron, maxUron, health, speed, delivery);
//         this.ataka = ataka;
        this.ataka = ataka;
        this.deff = deff;
        this.uron = uron;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.name = name;
    }

//    public int getAttak(){
//        return super.ataka;
//    }
}

