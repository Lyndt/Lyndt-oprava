package FLyable.flyInSky;

import FLyable.Flyable;

public class Helicopter extends Vehicle implements Flyable {


    public Helicopter(String name1, String color, int speed) {
        super(name1, color, speed);
    }

    @Override
    public String getInfo() {
        return "This model " + getName1() + ", " + getColor() + " color is flying at " + getSpeed() + " maximun speed";
    }

    @Override
    public void land() {
        System.out.println("we are landing! ...dong");

    }

    @Override
    public void fly() {
        System.out.println("ffft ffft ffft fft ftftft");

    }

    @Override
    public void takeOff() {
        System.out.println("we are taking off! Be careful!");

    }

    @Override
    public void name() {

    }
}
