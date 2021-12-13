package com.greenfoxacademy.music;

abstract public class StringedInstrument extends Instrument {
    protected int numberOfStrings;
    protected String sound;

    public StringedInstrument(String name, int numberOfStrings, String sound) {
        super(name);
        this.numberOfStrings = numberOfStrings;
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }

    @Override
    public void play() {
        System.out.println(name + ", a " +  numberOfStrings + "-stringed instruments that goes " + sound);
    }
}
