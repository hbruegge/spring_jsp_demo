package com.tutego.jsp_demo;

public class Book {
    private String isbn10;
    private String title;
    private String author;

    public Book(String isbn10, String title, String author) {
        this.isbn10 = isbn10;
        this.title = title;
        this.author = author;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn10 + ", Title: " + title + ", Author: " + author;
    }
}
