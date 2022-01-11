package Things;

import java.util.Collections;

public class MainFleet {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Things milk = new Things("Get Milk");
        Things obstacle = new Things("Remove the obstacles");
        Things standup = new Things("Stand up");
        Things lunch = new Things("Eat lunch");
        standup.complete();
        lunch.complete();
        fleet.add(milk);
        fleet.add(obstacle);
        fleet.add(standup);
        fleet.add(lunch);

        fleet.sort();
        System.out.println(fleet);

    }
}