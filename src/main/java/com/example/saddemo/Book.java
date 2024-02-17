package com.example.saddemo;

public class Book implements IBook {
    private int bookId;
    private String title;
    private String author ;

    private  State state ;



    public Book(int bookId,String title, String author) {
        this.state = new Available(bookId);
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }


    public Book() {

    }


    @Override
    public int getBookId() {
        return bookId;
    }

    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public String getAuthor() {
        return author;
    }

    public State getState() {
        return state;
    }
//    public Boolean change_state(){
//
//
//    }
}
