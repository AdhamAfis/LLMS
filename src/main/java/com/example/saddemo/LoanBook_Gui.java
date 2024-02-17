package com.example.saddemo;

import com.example.saddemo.Error.ErrorNotification;
import com.example.saddemo.Error.IErrorNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoanBook_Gui {
    @FXML
    private TextField userid;
    @FXML
    private TextField book_id_textfield;
    IGuiChangeScreen iGuiChangeScreen = new GuiChangeScreen();
    IErrorNotification errorNotification = new ErrorNotification();
    LoanBook loan = new LoanBook();
    ALoanBook loanBook = new CountingProxy(loan);

    @FXML
    void Back(ActionEvent event) {
        iGuiChangeScreen.ChangeGui_Screen("UserMain_Gui.fxml",book_id_textfield);
    }

    @FXML
    void Loan(ActionEvent event) {
   if (loanBook.ReserveBook(Integer.parseInt(userid.getText()), Integer.parseInt(book_id_textfield.getText()))){
       errorNotification.notification("Book Reserved SuccessFully","SuccessFully");
        iGuiChangeScreen.ChangeGui_Screen("UserMain_Gui.fxml",userid);}
   else errorNotification.notification("Failed to reserve book ","Error");
    }

}
