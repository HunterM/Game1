package units;

public class Rouge extends Pehotinec{

    public Rouge (String name) { super(8, 3, 2,4, 10, 6, 0, name); }



        @Override
        public void step() {

        }

        @Override
        public String getInfo() {
            return "Разбойник " + name;
        }
}
