package com.example.saddemo;

import com.example.saddemo.Error.ErrorNotification;
import com.example.saddemo.Error.IErrorNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UpdateAuthor_Gui {
    IErrorNotification errorNotification = new ErrorNotification();
    IGuiChangeScreen changeScreen = new GuiChangeScreen();
    ILibrarian librarian = new Librarian();
    @FXML
    private TextField bookIdtext;

    @FXML
    private TextField newAuhtortext;

    @FXML
    void Back(ActionEvent event) {
        changeScreen.ChangeGui_Screen("LibraryMainScreen.fxml", bookIdtext);
    }

    @FXML
    void Update(ActionEvent event) {
        try {
            int bookid = Integer.parseInt(bookIdtext.getText());
            String newAuthor = newAuhtortext.getText();
            librarian.librarian_Update_Book_author(bookid, newAuthor);
            errorNotification.notification("Book Updated Successfully", "Done");
            changeScreen.ChangeGui_Screen("LibraryMainScreen.fxml", bookIdtext);

        } catch (Exception e) {
            errorNotification.notification("Try Again", "Error");
        }
    }
}
