package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(int numberOfStrings){
        super("Electric Guitar", numberOfStrings, "Twang");
    }
    public ElectricGuitar() {
        this(6);
    }

}
