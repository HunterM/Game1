package units;

public class Fermer extends Pehotinec{

    public Fermer(String name) {
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
        return "Фермер " + name;
    }
}
