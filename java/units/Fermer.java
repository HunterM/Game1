package units;

public class Fermer extends Human {
    protected int cartridges;
    protected Fermer(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
                     int speed, int cartridges, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.cartridges = cartridges;
    }
    public Fermer(String name, Point2D coords) {
        super(name, 50.f, 50, 1, 1, 1, 1,
                3, coords.posX, coords.posY);
        this.cartridges = 1;
    }

    protected void armiger(Archer Shooter){  }

    public int getCartridgesFarmer () {
        return this.cartridges;
    }
    public void setCartridgesFarmer (int cartridges) {
        this.cartridges = cartridges;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Fermer.super.name)
                .append("\t| ATK:\t").append(Fermer.super.attack)
                .append("\t| HP:\t").append(Fermer.super.hp)
                .append(" \t| Arrows: ").append(Fermer.this.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Fermer.super.coords.posX).append(".").append(Fermer.super.coords.posY);
    }
}