package com.example.saddemo;

import com.example.saddemo.CRUD_Book.*;

public class Librarian implements ILibrarian ,IPerson{

    private int id ;
    private String firstname ;
    private String lastname;
    private String email;
    private APersonAddress address;

    private  static IAddBookInCatalog addBook_bookCatalog;

    private static IDeleteBookInCatalog deleteBookInCatalog;
    private static IUpdateBookInCatalog updateBookInCatalog;

    public Librarian(int id, String firstname, String lastname, String email, APersonAddress address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
    }

    public Librarian() {

    }

    @Override
    public void librarian_addBook(IBook book) {
        addBook_bookCatalog=new AddBookInCatalog();
        addBook_bookCatalog.addBook(book);
    }

    @Override
    public void librarian_deleteBook(int bookid) {
        deleteBookInCatalog= new DeleteBookInCatalog();
       deleteBookInCatalog.deleteBook(bookid);
    }

    @Override
    public void librarian_Update_Book_title(int bookid, String new_title) {
        updateBookInCatalog = new UpdateBookInCatalog();
        updateBookInCatalog.updateBook_title(bookid,new_title);
    }

    @Override
    public void librarian_Update_Book_author(int bookid, String new_author) {
        updateBookInCatalog = new UpdateBookInCatalog();
       updateBookInCatalog.updateBook_author(bookid,new_author);
    }

    @Override
    public void librarian_Update_Book_availability(int bookid,boolean new_availability) {
        updateBookInCatalog = new UpdateBookInCatalog();
        updateBookInCatalog.updateBook_availability(bookid,new_availability);
    }
    @Override
    public   int getId() {
        return id;
    }
    @Override
    public   void setId(int id) {
        this.id = id;
    }
    @Override
    public  String getFirstname() {
        return firstname;
    }
    @Override
    public   void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @Override
    public   String getLastname() {
        return lastname;
    }
    @Override
    public  void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override

    public  String getEmail() {
        return email;
    }
    @Override
    public  void setEmail(String email) {
        this.email = email;
    }
    @Override
    public  APersonAddress getAddress() {
        return address;
    }
    @Override
    public  void setAddress(APersonAddress address) {
        this.address = address;
    }



}
