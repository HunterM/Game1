package units;

public abstract class Human implements inGameInterface {
    
    protected int ataka, deff, shots, uron, maxUron, health, speed, delivery, mana;

    public Human(int ataka, int deff, int shots, int uron, int maxUron, 
                 int health, int speed,int delivery,int mana, String name) {
        this.ataka = ataka;
        this.deff = deff;
        this.shots = shots;
        this.uron = uron;
        this.maxUron = maxUron;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.mana = mana;

        
    }

    public Human(int ataka, int deff, int uron, int maxUron, int health, int speed, int delivery) {
    }

    public Human(int ataka, int deff, int uron, int health, int speed, int mana) {
    }

//    public Human(int hp, int maxHp, int ataka, int deff) {
//        this.hp = hp;
//        this.maxHp = maxHp;
//        this.ataka = ataka;
//        this.deff = deff;
//    }


    @Override
    public String getInfo() {
        return null;
    }
}
