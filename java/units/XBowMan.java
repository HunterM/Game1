package units;

public class XBowMan extends Archer{

    public XBowMan(String name) {
        super(120,120,5,5,15,20, name);
        }
//    @Override
//    public String toString(){
//        return "Арбалетчик " + name;
//    }

//    @Override
//    public void step() {
//
//    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name;
    }
}


