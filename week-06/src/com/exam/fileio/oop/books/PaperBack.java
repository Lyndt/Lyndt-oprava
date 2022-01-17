package com.exam.fileio.oop.books;

public class PaperBack extends Book {
    public PaperBack(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages);
    }

    @Override
    protected int calculateWeight() {
        return 0;
    }
}
