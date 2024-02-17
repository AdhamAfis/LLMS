package com.example.saddemo;

import com.example.saddemo.Error.ErrorNotification;
import com.example.saddemo.Error.IErrorNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UserMain_Gui {

    IGuiChangeScreen changeScreen = new GuiChangeScreen();
     IBookSearch bookSearch = new BookSearch();
     IErrorNotification notification = new ErrorNotification();
    @FXML
    private TextField search_TextField;

    @FXML
    void cancel(ActionEvent event) {
        changeScreen.ChangeGui_Screen("Login.fxml",search_TextField);
    }

    @FXML
    void searchByBookId(ActionEvent event) {
        String search = search_TextField.getText();
        try {


            if (bookSearch.searchBybookCopyID(Integer.parseInt(search)))
                notification.notification("Book Found ", "Found");
            else notification.notification("Book Not Found ", "Not Found ");
        } catch (Exception e) {
            notification.notification("Try Again", "Error");

        }
    }

  /*  @FXML
    void searchBy_ava(ActionEvent event) {
        String search = search_TextField.getText();
        if(bookSearch.searchByStatus(Boolean.valueOf(search))){

        }*/


    @FXML
    void search_byTitle(ActionEvent event) {
        String search = search_TextField.getText();
        try {


            if (bookSearch.searchBytitle(search))
                notification.notification("Book Found!", "Found");
            else
                notification.notification("Book not Found!", "Not Found");
        }catch (Exception e){      notification.notification("Try Again", "Error");
        }
    }


    @FXML
    void search_byauthor(ActionEvent event) {
        String search = search_TextField.getText();
        try {
            if (bookSearch.searchByauthor(search))
                notification.notification("Book Found!", "Found");
            else
                notification.notification("Book not Found!", "Not Found");
        } catch (Exception e){
            notification.notification("Try Again", "Error");
        }
    }


    @FXML
    void LoanBook(ActionEvent event) {
          changeScreen.ChangeGui_Screen("LoanBook.fxml",search_TextField);
    }
}
