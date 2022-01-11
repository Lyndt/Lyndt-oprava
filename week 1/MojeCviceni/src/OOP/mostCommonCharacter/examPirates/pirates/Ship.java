package OOP.mostCommonCharacter.examPirates.pirates;

import java.util.List;

public class Ship {
    private List<Pirate> pirates;

    public void addPirates(Pirate pirate) {
        boolean hasCaptain = false;

        for (Pirate crewMember : pirates) {
            if (crewMember instanceof Captain) {
                hasCaptain = true;
                break;
            }
        }
        if (pirate instanceof Captain && hasCaptain) {
            return;
        }
        pirates.add(pirate);
    }
}
