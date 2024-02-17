package com.example.saddemo.CRUD_Book;

import com.example.saddemo.Database;
import com.example.saddemo.IBook;

public class DeleteBookInCatalog implements IDeleteBookInCatalog {


    @Override
    public void deleteBook(int bookId) {
        Database.deleteBook(bookId);
    }
}
