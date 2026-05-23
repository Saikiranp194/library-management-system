package com.example.demo.model;

public class Book {

    private int id;
    private String title;

    // Constructor
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }
}