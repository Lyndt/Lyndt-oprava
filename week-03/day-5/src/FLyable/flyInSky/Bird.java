package FLyable.flyInSky;

import FLyable.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void land() {
        System.out.println("hard one!");

    }

    @Override
    public void fly() {
        System.out.println("weee I can fly!");

    }

    @Override
    public void takeOff() {
        System.out.println("I am landing!");

    }

    @Override
    public void name() {


    }
}
