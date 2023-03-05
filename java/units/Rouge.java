package units;
public class Rouge extends Pehotinec {
    public Rouge(String name, Point2D coords) {
        super(name, 70.f, 70, 10, 2, 4, 10,
                6, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит:\t").append(Rouge.super.name)
                .append("\t| ATK:\t").append(Rouge.super.attack)
                .append("\t| HP:\t").append(Rouge.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Rouge.super.coords.posX).append(".").append(Rouge.super.coords.posY);
    }
}