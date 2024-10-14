package com.tutego.jsp_demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BookService {
    Collection<Book> getBooks() {
        Collection<Book> books = new ArrayList<Book>();

        books.add(new Book(
                "3836290499",
                "Spring Boot 3 und Spring Framework 6",
                "Christian Ullenboom"));

        books.add(new Book(
                "383629544X",
                "Java ist auch eine Insel",
                "Christian Ullenboom"));

        return books;
    }
}
