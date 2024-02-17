package com.example.saddemo;

public class CountingProxy extends ALoanBook{

   private LoanBook loanBook ;
   private  int count ;

    public CountingProxy(LoanBook loanBook) {
        this.loanBook = loanBook;

    }

    @Override
    public Boolean ReserveBook(int userId, int bookid, int count) {
        return null;
    }

    @Override
    public Boolean ReserveBook(int userId, int bookid) {
       count= Database.getNumberOfBorrowedBooks(userId);
       count++;
    return loanBook.ReserveBook(userId,bookid, count);

    }

    public int getCount() {
        return count;
    }
}
