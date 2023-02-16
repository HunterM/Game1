package units;

public abstract class Human implements inGameInterface {
    protected int hp, maxHp, ataka, deff;

    public Human(int hp, int maxHp, int ataka, int deff, int i, int i1, String name) {
    }

    public Human(int hp, int maxHp, int ataka, int deff) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.ataka = ataka;
        this.deff = deff;
    }


    @Override
    public String getInfo() {
        return null;
    }
}
