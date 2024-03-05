package com.example.libbackend.model;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String genre;
    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean available;

    // Reference to Borrower entity
    @ManyToOne
    @JoinColumn(name = "borrower_id") // Assuming the column name in the book table is borrower_id
    private Borrower borrower;

    // Constructors, getters, and setters
    // Constructor
    public Book() {}

    public Book(String title, String author, String genre, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
}
