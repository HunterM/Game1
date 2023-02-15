package units;

public abstract class Human implements inGameInterface {
    protected int hp, maxHp, ataka, deff;
    public int getHp() {
        return hp;
    }

    public void setHpHp(int hp) {
        if (hp>0)
        this.maxHp = hp;
    }

    public Human(int hp, int maxHp, int ataka, int deff) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.ataka = ataka;
        this.deff = deff;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return null;
    }
}
