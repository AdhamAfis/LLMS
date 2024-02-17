package com.example.saddemo;

import com.example.saddemo.CRUD_Book.DeleteBookInCatalog;
import com.example.saddemo.CRUD_Book.IDeleteBookInCatalog;
import com.example.saddemo.Error.ErrorNotification;
import com.example.saddemo.Error.IErrorNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DeleteBook_Gui {

    IErrorNotification errorNotification = new ErrorNotification();

    IDeleteBookInCatalog deleteBookInCatalog = new DeleteBookInCatalog();
    IGuiChangeScreen guiChangeScreen = new GuiChangeScreen();
    ILibrarian librarian = new Librarian();


    @FXML
    private TextField deleteID;

    @FXML
    void Back(ActionEvent event) {
        guiChangeScreen.ChangeGui_Screen("LibraryMainScreen.fxml", deleteID);
    }

    @FXML
    void DeleteBook(ActionEvent event) {
        try {
            int bookid = Integer.parseInt(deleteID.getText());
          librarian.librarian_deleteBook(bookid);
            errorNotification.notification("Book Deleted Successfully", "Done");
            guiChangeScreen.ChangeGui_Screen("LibraryMainScreen.fxml", deleteID);
        } catch (Exception e) {
            errorNotification.notification("Try Again", "Error");
        }


    }
}
