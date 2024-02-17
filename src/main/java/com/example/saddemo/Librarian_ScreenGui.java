package com.example.saddemo;

import com.example.saddemo.CRUD_Book.IAddBookInCatalog;
import com.example.saddemo.CRUD_Book.IUpdateBookInCatalog;
import com.example.saddemo.CRUD_Book.UpdateBookInCatalog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class Librarian_ScreenGui {

    IGuiChangeScreen iGuiChangeScreen = new GuiChangeScreen();



    @FXML
    private MenuButton settings;
    @FXML
    private TextField hidden;


    @FXML
    void choose_AddBook(ActionEvent event) {
   iGuiChangeScreen.ChangeGui_Screen("AddBook.fxml",hidden);
    }
    @FXML
    void choose_DeleteBook(ActionEvent event) {
        iGuiChangeScreen.ChangeGui_Screen("DeleteBook.fxml",hidden);
    }

    @FXML
    void choose_update_author(ActionEvent event) {
        iGuiChangeScreen.ChangeGui_Screen("UpdateBookAuthor_Gui.fxml",hidden);
    }

    @FXML
    void choose_update_availability(ActionEvent event) {
        iGuiChangeScreen.ChangeGui_Screen("UpdateBookAvailability.fxml",hidden);
    }

    @FXML
    void choose_update_title(ActionEvent event) {
        iGuiChangeScreen.ChangeGui_Screen("UdpateBookTitle_Gui.fxml",hidden);
    }


}
