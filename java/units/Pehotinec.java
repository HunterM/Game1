package units;

public abstract class Pehotinec extends Human{
    protected int shots, maxShots;
    protected String name;

    public Pehotinec(int ataka, int deff, int uron, int maxUron, int health, int speed, int delivery, String name) {
        super(ataka, deff, uron, maxUron, health, speed, delivery);
//        this.shots = shots;
//        this.maxShots = maxShots;
        this.name = name;
    }

//    public int getAttak(){
//        return super.ataka;
//    }
}

