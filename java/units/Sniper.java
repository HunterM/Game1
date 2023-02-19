package units;

public class Sniper extends Archer{

    public Sniper(String name) {
        super(12,10,32,8,10,15,9, name);
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
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Снайпер " + name;
    }
}
