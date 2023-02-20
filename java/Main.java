import units.*;

import java.util.Comparator;
import java.util.Random;
import java.util.ArrayList;
import java.util.Random;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Human> List = new ArrayList<>();
        for (int index =0; index <10; index++)
        switch (new Random().nextInt(0, 9)) {
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
        }
        ArrayList<Human> List1 = new ArrayList<>();
        for (int index =0; index <10; index++)
            switch (new Random().nextInt(0, 9)) {
                case 0:
                    List1.add(new badFarmer(getName()));
                    break;
                case 1:
                    List1.add(new Rouge(getName()));
                    break;
                case 2:
                    List1.add(new Sniper(getName()));
                    break;
                case 3:
                    List1.add(new Prist(getName()));
                    break;

                case 5:
                    List1.add(new Fermer(getName()));
                    break;
                case 6:
                    List1.add(new Pikiner(getName()));
                    break;
                case 7:
                    List1.add(new XBowMan(getName()));
                    break;
                case 8:
                    List1.add(new Magic(getName()));
                    break;
            }

        List1.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHP()-o1.getHP();

                return o2.getSpeed() - o1.getSpeed();
            }
        });
    List.sort(new Comparator<Human>() {
        @Override
        public int compare(Human o1, Human o2) {
            if (o2.getSpeed() == o1.getSpeed()) return o2.getHP()-o1.getHP();

            return o2.getSpeed() - o1.getSpeed();
        }
    });

        List.forEach(n-> System.out.println(n.getInfo() + " " + n.getSpeed() + " <> " + n.getHP()));
        System.out.println("===================================");
        List1.forEach(n-> System.out.println(n.getInfo() + " " + n.getSpeed() + " <> " + n.getHP()));
        }

//        List.forEach(n -> System.out.println(n.getInfo()));


    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

}