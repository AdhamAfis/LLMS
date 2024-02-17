package com.example.saddemo;

import com.example.saddemo.Authentication_Methods.Authentication;
import com.example.saddemo.Authentication_Methods.IAuthentication;
import com.example.saddemo.Error.ErrorNotification;
import com.example.saddemo.Error.IErrorNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;

public class Login_Gui {
    IAuthentication authentication = new Authentication();
    IErrorNotification error = new ErrorNotification();
    IGuiChangeScreen guiChangeScreen = new GuiChangeScreen();


    @FXML
    private TextField password_text;

    @FXML
    private TextField username_TextField;





    @FXML
    void Choose_Login(ActionEvent event)  {
        try {
            int id = Integer.parseInt(username_TextField.getText());
            String password = password_text.getText();
           if (authentication.AuthenticationLogin(id, password)) {
               if (Database.isFlag()){
                 guiChangeScreen.ChangeGui_Screen("LibraryMainScreen.fxml",password_text);}
               else
               {guiChangeScreen.ChangeGui_Screen("UserMain_Gui.fxml",password_text);}

           }
           else  error.notification("Wrong Id/Password ","Error Message ");
        }
        catch (Exception e ){
        error.notification("Try Again ","Error Message ");
        }
    }

    @FXML
    void Choose_Register(ActionEvent event) {
       guiChangeScreen.ChangeGui_Screen("Register .fxml",password_text);
    }
}

