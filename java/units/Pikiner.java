package units;

public class Pikiner extends Pehotinec{

    public Pikiner(String name) {
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
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Пикинер " + name;
    }
}
