package units;

public class XBowMan extends Archer{

    public XBowMan(String name) {
        super(6, 3,16, 2,3,10,4, name);
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
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name;
    }
}


