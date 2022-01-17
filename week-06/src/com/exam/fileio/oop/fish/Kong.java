package com.exam.fileio.oop.fish;

public class Kong extends Fish {
    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public int feed() {
        return weight += 2;
    }
}
