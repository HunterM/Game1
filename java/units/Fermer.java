package units;

public class Fermer extends Pehotinec{

    public Fermer(String name) {
        super(1,1,1,0,1,3, 1, name);
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Фермер " + name;
    }
}
