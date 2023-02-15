package units;

public abstract class Archer extends Human{
    protected int shots, maxShots;
    protected String name;

    public Archer(int hp, int maxHp, int ataka, int deff, int shots, int maxShots, String name) {
        super(hp, maxHp, ataka, deff);
        this.shots = shots;
        this.maxShots = maxShots;
        this.name = name;
    }

    public int getAttak(){
        return super.ataka;
    }
}
