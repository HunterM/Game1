package units;

public class Sniper extends Archer{

    public Sniper(String name) {
        super(120,120,5,5,15,20, name);
    }
//    @Override
//    public String toString(){
//        return "Снайпер " + name;
//    }

//    @Override
//    public void step() {
//
//    }

    @Override
    public String getInfo() {
        return "Снайпер " + name;
    }
}
