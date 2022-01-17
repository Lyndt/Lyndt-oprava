package com.exam.fileio.oop.fish;

public class Fish {

    private String name;
    protected int weight;
    private String color;


    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;

    }

    protected boolean hasShortTermMemory() {
        return false;
    }

    public int feed() {
        return weight++;
    }

    public void status() {
        System.out.println(name + ", weight: " + weight + ", color: " + ", short-term memory loss: " + hasShortTermMemory());
    }

    public int getWeight() {
        return weight;
    }
}
