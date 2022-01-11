package OOP.mostCommonCharacter.examPirates.pirates;

public class Captain extends Pirate {
    public Captain(String name) {
        super(name);
    }

    @Override
    public void work() {
        goldAmount += 10;
        healthPoints -=5;
    }

    @Override
    public void party() {
        healthPoints += 10;
    }
}
