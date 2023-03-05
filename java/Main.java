import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static final int UNITS = 10;
    public static ArrayList<Human> allTeam = new ArrayList<>();
    public static ArrayList<Human> holyTeam = new ArrayList<>();
    public static ArrayList<Human> darkTeam = new ArrayList<>();

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Для начала игры нажмите Enter.");
        user_input.nextLine();
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);

        while (true){
            View.view();
            user_input.nextLine();
            for (Human human: allTeam) {
                if (holyTeam.contains(human)) human.step(holyTeam, darkTeam);
                else human.step(darkTeam, holyTeam);
            }
        }
    }
    static void createTeam (ArrayList team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4)+offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(getName(), new Point2D(i + 1, posY)));
                    break;
                case (1):
                    team.add(new Rouge(getName(), new Point2D(i + 1, posY)));
                    break;
                case (2):
                    team.add(new Magic(getName(), new Point2D(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Fermer(getName(), new Point2D(i + 1, posY)));
                    break;
                case (4):
                    team.add(new Pikiner(getName(), new Point2D(i + 1, posY)));
                    break;
                case (5):
                    team.add(new Pikiner(getName(), new Point2D(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Pikiner(getName(), new Point2D(i + 1, posY)));
                    break;
            }
        }
    }
    static void sortTeam (ArrayList<Human> team){
        team.sort(new Comparator<Human>() {
            @Override
            public int compare(Human t0, Human t1) {
                if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                else  return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }
    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}

