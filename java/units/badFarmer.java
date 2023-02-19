package units;

public class badFarmer extends Pehotinec{

    public badFarmer(String name) {
        super(1,1,1,0,1,3, 1, name);
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Прислужник " + name;
    }
}
