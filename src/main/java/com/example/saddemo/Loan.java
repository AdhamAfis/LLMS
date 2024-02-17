package com.example.saddemo;


import com.example.saddemo.IBook;

public class Loan extends State {
    public Loan(int bookid ) {
        super(bookid);
    }

    @Override
    public boolean isFound() {
        return false;
    }
}
