package units;

public abstract class Archer extends Human{
//    protected int shots, maxShots;
    protected String name;

    public Archer(int ataka, int deff, int shots, int uron, int maxUron,
                  int health, int speed, String name) {
        super(ataka, deff, shots, uron, maxUron, health, speed);
        this.ataka = ataka;
        this.deff = deff;
        this.uron = uron;
        this.maxUron = maxUron;

        this.health = health;
        this.speed = speed;
        this.name = name;
    }

//    public int getAttak(){
//        return super.ataka;
//    }
}
