package FLyable;

import FLyable.flyInSky.Bird;
import FLyable.flyInSky.Helicopter;

public class mainLanding {
    public static void main(String[] args) {

        Helicopter helicopter = new Helicopter("HeliHand30000", "BLACK/WHITE", 256);
        System.out.println(helicopter.getInfo());
        System.out.println("when landing you can hear:");
        helicopter.land();
        System.out.println();
        System.out.println("when taking off, its like:");
        helicopter.takeOff();
        System.out.println();
        System.out.println("when flying..");
        helicopter.fly();
        System.out.println("*******************************************************************************************************************************************");
        Bird bird = new Bird("Raven");
        System.out.print(bird.getName());
        System.out.print(" " +bird.breed());





    }
}
