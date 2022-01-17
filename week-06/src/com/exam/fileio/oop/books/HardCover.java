package com.exam.fileio.oop.books;

public class HardCover extends Book {

    private static final int COVER_WEIGHT = 100;
    public HardCover(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages);
    }

    @Override
    protected int calculateWeight() {
        return numberOfPages * 10 + COVER_WEIGHT;
    }
}
