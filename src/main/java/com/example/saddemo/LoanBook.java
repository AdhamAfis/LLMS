package com.example.saddemo;

public class LoanBook extends ALoanBook{

    @Override
    public Boolean ReserveBook(int userId, int bookid , int count ) {
        return Database.reserveBook(userId, bookid,count);
    }

    @Override
    public Boolean ReserveBook(int userId, int bookid) {
        return null;
    }
}
