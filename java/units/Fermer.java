package units;

import java.util.ArrayList;

public class Fermer extends Human {
    protected int streli;

    public Fermer(String name, Point2D coords) {
        super(name, 50.f, 50, 1, 1, 1, 1,
                3, coords.posX, coords.posY);
        this.streli = 1;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (!state.equals("Мертвяк")) state = "Ходит";
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Fermer.super.name)
                .append("\t| ATK:\t").append(Fermer.super.attack)
                .append("\t| HP:\t").append(Fermer.super.hp)
                .append(" \t| Arrows: ").append(Fermer.this.streli)
                .append("\t|").append("\t| (X.Y) : ").append(Fermer.super.coords.posX).append(".").append(Fermer.super.coords.posY);
    }
}