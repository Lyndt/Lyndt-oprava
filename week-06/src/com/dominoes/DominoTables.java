package com.dominoes;

public class DominoTables {
    private final int leftSide;
    private final int rightSide;

    public DominoTables(int leftSide, int rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    @Override
    public String toString() {
        return "[" + leftSide + "," + rightSide + "]";
    }
}
