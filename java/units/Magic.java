package units;

public class Magic extends Saint{

    public Magic(String name) {
        super(120,120,5,5,15,20, name);
    }
    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Маг " + name;
    }
}

