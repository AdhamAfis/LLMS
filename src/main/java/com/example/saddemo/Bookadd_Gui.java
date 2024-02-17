package com.example.saddemo;

import com.example.saddemo.CRUD_Book.AddBookInCatalog;
import com.example.saddemo.CRUD_Book.IAddBookInCatalog;
import com.example.saddemo.Error.ErrorNotification;
import com.example.saddemo.Error.IErrorNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Bookadd_Gui {
    @FXML
    private TextField BookId_text;

    @FXML
    private TextField Availabiltiy_text;

    @FXML
    private TextField Title_text;

    @FXML
    private TextField Author_text;
    IErrorNotification errorNotification =  new ErrorNotification();
    IGuiChangeScreen changeScreen = new GuiChangeScreen();
    ILibrarian librarian = new Librarian();
    IBook book ;
    @FXML
    void clickedonAdd(ActionEvent event) {
        try {
        int bookid = Integer.parseInt(BookId_text.getText());
       boolean availability = Boolean.parseBoolean(Availabiltiy_text.getText());
       String title = Title_text.getText();
       String author = Author_text.getText();
        book = new Book(bookid,title,author);
        librarian.librarian_addBook(book);
            errorNotification.notification("Book Added Successfully", "Done");
            changeScreen.ChangeGui_Screen("LibraryMainScreen.fxml",BookId_text);


        }
        catch (Exception e){  errorNotification.notification("Error","Error");}

    }
    @FXML
    void Back(ActionEvent event) {
        changeScreen.ChangeGui_Screen("LibraryMainScreen.fxml",BookId_text);
    }

}
