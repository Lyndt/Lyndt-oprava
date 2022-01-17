package com.exam.fileio.oop.fish;

import java.util.List;

public class Aquarium {
    private List<Fish> school;

    public void addFish(Fish fish) {
        school.add(fish);

    }

    public void feed() {
        for (Fish fish : school) {
            fish.feed();
        }

    }

    public void removeFish() {
        school.removeIf(fish -> fish.getWeight() >= 11);
    }

    public void getStatus() {
        for (Fish fish : school) {
            fish.status();

        }
    }
}
