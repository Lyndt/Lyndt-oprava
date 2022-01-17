package com.exam.fileio.oop;

public abstract class Book {
    //TODO: Every book has a title, an author, a release year
    private final String title;
    private final String author;
    private final int releaseYear;
    protected final int numberOfPages;
    private int weight;

    public Book(String title, String author, int releaseYear, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.weight = calculateWeight();
    }

    protected abstract int calculateWeight();

    public String getBookInfo() {
        return String.format("%s: %s (%d)", this.author, this.title, this.releaseYear);
    }
}
