import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Sniper archer = new Sniper("Vanya");

        ArrayList<Human> List = new ArrayList<>();
        List.add(new XBowMan(getName()));
        List.add(new Sniper(getName()));
        List.add(new Magic(getName()));
        List.add(new Prist(getName()));
        List.forEach(n -> System.out.println(n.getInfo()));

    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

}
