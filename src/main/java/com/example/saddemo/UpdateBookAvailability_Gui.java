package com.example.saddemo;

import com.example.saddemo.Error.ErrorNotification;
import com.example.saddemo.Error.IErrorNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UpdateBookAvailability_Gui {
    IErrorNotification errorNotification = new ErrorNotification();
    IGuiChangeScreen changeScreen = new GuiChangeScreen();
    ILibrarian librarian = new Librarian();
    @FXML
    private TextField bookidtext;

    @FXML
    private TextField availabilitytext;

    @FXML
    void back(ActionEvent event) {
        changeScreen.ChangeGui_Screen("LibraryMainScreen.fxml", bookidtext);
    }

    @FXML
    void update(ActionEvent event) {
        try {
                int bookid = Integer.parseInt(bookidtext.getText());
                Boolean new_availability= Boolean.valueOf(availabilitytext.getText());
                librarian.librarian_Update_Book_availability(bookid, new_availability);
                errorNotification.notification("Book Updated Successfully", "Done");
                changeScreen.ChangeGui_Screen("LibraryMainScreen.fxml", bookidtext);

    }
        catch (Exception e) {
        errorNotification.notification("Try Again", "Error");
    }

    }
}
