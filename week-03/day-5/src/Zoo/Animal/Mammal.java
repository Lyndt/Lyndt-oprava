package Zoo.Animal;

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }


    @Override
    public String breed() {
        return "is breeding by pushing miniature versions out.";
    }
}
