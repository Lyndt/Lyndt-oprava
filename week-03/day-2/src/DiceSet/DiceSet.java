
package DiceSet;

import java.util.ArrayList;
import java.util.List;

public class DiceSet {

    //fields
    ArrayList<Integer> dice = new ArrayList<>();

    //behaviiors
    public List<Integer> rollSet() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrentSet() {
        return dice;
    }

    public int getCurrentItem(int i) {
        return dice.get(i);
    }

    public void rerollSet() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void rerollItem(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }
}