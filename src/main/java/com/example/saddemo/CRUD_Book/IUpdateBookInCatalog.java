package com.example.saddemo.CRUD_Book;
import com.example.saddemo.IBook;

public interface IUpdateBookInCatalog {
    public void updateBook_title(int bookid,String title );


    public void updateBook_author(int bookid,String new_author) ;

    public void updateBook_availability(int bookid,Boolean availability) ;
}
