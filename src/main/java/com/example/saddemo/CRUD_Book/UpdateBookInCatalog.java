package com.example.saddemo.CRUD_Book;

import com.example.saddemo.Database;
import com.example.saddemo.IBook;

public class UpdateBookInCatalog implements IUpdateBookInCatalog {
    @Override
    public void updateBook_title(int bookid,String new_title) {
        Database.updateBook_title(bookid,new_title);
    }
    @Override
    public void updateBook_author(int bookid ,String new_author) {

        Database.updateBook_author(bookid, new_author);
    }
    @Override
    public void updateBook_availability(int bookid,Boolean availability) {
        Database.updateBook_availability(bookid,availability);
    }

}
