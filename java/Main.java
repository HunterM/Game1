import units.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<Human> List = new ArrayList<>();
        for (int index =0; index <10; index++)
        switch (new Random().nextInt(0, 10)){
            case 0:
                List.add(new badFarmer(getName()));
 break;
            case 1:
                List.add(new Rouge(getName()));
 break;
            case 2:
                List.add(new Sniper(getName()));
 break;
            case 3:
                List.add(new Prist(getName()));
 break;

            case 5:
                List.add(new Fermer(getName()));
break;
            case 6:
                List.add(new Pikiner(getName()));
 break;
            case 7:
                List.add(new XBowMan(getName()));
 break;
            case 8:
                List.add(new Magic(getName()));
 break;
//            case 9:
//                List.add(new XBowMan(getName()));
// break;
        }
// Sniper archer = new Sniper("Vanya");
// ArrayList<Human> List = new ArrayList<>();
// List.add(new XBowMan(getName()));
// List.add(new Sniper(getName()));
// List.add(new Magic(getName()));
// List.add(new Prist(getName()));
// List.add(new Fermer(getName()));
// List.add(new Pikiner(getName()));
//
        List.forEach(n -> System.out.println(n.getInfo()));
// List.forEach(n -> System.out.println(n.getInfo()));
// List.forEach(n -> System.out.println(n.getInfo()));
// List.forEach(n -> System.out.println(n.getInfo()));
// List.forEach(n -> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}