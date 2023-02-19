package units;

public class Pikiner extends Pehotinec{

    public Pikiner(String name) {
        super(4,5,1,3,10,4,0, name);
    }
    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Пикинер " + name;
    }
}
