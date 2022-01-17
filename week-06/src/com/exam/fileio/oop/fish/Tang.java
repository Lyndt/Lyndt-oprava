package com.exam.fileio.oop.fish;

public class Tang extends Fish {
    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    protected boolean hasShortTermMemory() {
        return true;
    }
}
