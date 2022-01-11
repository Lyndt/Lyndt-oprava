package OOP.mostCommonCharacter.examPirates.pirates;

public class Pirate {
    private String name;
    protected int goldAmount;
    protected int healthPoints;
    private boolean hasWoodenLeg;

    public Pirate(String name) {
        this.name = name;
        this.goldAmount = 0;
        this.healthPoints = 10;
    }
    public void work() {
        goldAmount++;
        healthPoints--;
    }
    public void party() {
        healthPoints++;
    }
    public String toString() {
        String introduction;
        if (hasWoodenLeg) {
            return "Hello, I am" + name + "and I have wooden leg and" + goldAmount + "golds.";
        } else {
            return "Hello, I am" + name + "and I still have my real leg and" + goldAmount + "golds.";
        }
    }
}
