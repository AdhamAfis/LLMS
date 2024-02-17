package com.example.saddemo.CRUD_Book;
import com.example.saddemo.Book;
import com.example.saddemo.Database;
import com.example.saddemo.IBook;

public class AddBookInCatalog implements IAddBookInCatalog {
    @Override
    public void addBook(IBook book) {
        Database.addBook(book.getBookId(), book.getState().isFound(), book.getTitle(), book.getAuthor());
    }
}