package units;

import java.util.ArrayList;

public interface inGameInterface {
    StringBuilder getInfo();
    void step(ArrayList<Human> team1, ArrayList<Human> team2);

}
