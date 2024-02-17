package com.example.saddemo;

public interface ILibrarian {

    public void librarian_addBook(IBook book);
    public void librarian_deleteBook(int bookid);
    public void librarian_Update_Book_title(int bookid,String new_title);
    public void librarian_Update_Book_author(int bookid,String new_author);
    public void librarian_Update_Book_availability(int bookid, boolean change_availability);


}

