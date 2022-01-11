package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar(int numberOfStrings) {
        super("Bass Guitar", numberOfStrings, "Duum-duum-duum");
    }
    public BassGuitar() {
        this(6);
    }

}
