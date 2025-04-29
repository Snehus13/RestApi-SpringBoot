package com.restapi.springbootrestapi.entities;

public class Book {
    
    private int id;
    private String titile;
    private String author;

   
    public Book(int id, String titile, String author) {
        this.id = id;
        this.titile = titile;
        this.author = author;
    }
    public Book() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitile() {
        return titile;
    }
    public void setTitile(String titile) {
        this.titile = titile;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", titile=" + titile + ", author=" + author + "]";
    }
    
    

}
