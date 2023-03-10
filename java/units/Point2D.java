package units;

public class Point2D {
    protected int posX;
    protected int posY;

    public Point2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected boolean isLeft(Point2D oponent) {
        return posX < oponent.posX;
    }

    protected double getDistance(Point2D oponent) {
        return Math.sqrt(Math.pow(posX - oponent.posX, 2) + Math.pow(posY - oponent.posY, 2));
    }

    protected Point2D chooseWay(Point2D opponent) {

        return new Point2D(posX - opponent.posX, posY - opponent.posY);
    }
}