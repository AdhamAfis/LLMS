package com.example.saddemo;
import com.example.saddemo.Authentication_Methods.Authentication;
import com.example.saddemo.Authentication_Methods.IAuthentication;
import com.example.saddemo.Error.ErrorNotification;
import com.example.saddemo.Error.IErrorNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Objects;

public class Register_Gui {
    IErrorNotification errorNotification = new ErrorNotification();
    IAuthentication authentication = new Authentication();
    IGuiChangeScreen guiChangeScreen = new GuiChangeScreen();
    @FXML
    private TextField Password_TextField;

    @FXML
    private TextField id_text;

    @FXML
    private TextField Password_confirm_TextField;

    @FXML
    private TextField first_name_textfield;

    @FXML
    private TextField last_name_textfield;

    @FXML
    private TextField email_textfield;

    @FXML
    private TextField streetn_name_textfield;

    @FXML
    private TextField block_number_textfield;

    @FXML
    private TextField city_name_textfield;

    @FXML
    private TextField country_name_textfield;

    @FXML
    private TextField govern_name_textfield;

    @FXML
    void Sign_in(ActionEvent event) {
        try {
            int id = Integer.parseInt(id_text.getText());
            String password = Password_TextField.getText();
            String confirm_password = Password_confirm_TextField.getText();
            String countryName = country_name_textfield.getText();
            String governName = govern_name_textfield.getText();
            String cityName = city_name_textfield.getText();
            int blockNumber = Integer.parseInt(block_number_textfield.getText());
            String firstName = first_name_textfield.getText();
            String email = email_textfield.getText();
            String streetName = streetn_name_textfield.getText();
            String lastName = last_name_textfield.getText();

            if (Objects.equals(password, confirm_password)) {
                System.out.println("wow");
                authentication.AuthenticationRegister(id,password,firstName,lastName,email,streetName,countryName,governName,cityName,blockNumber);
                guiChangeScreen.ChangeGui_Screen("Login.fxml",id_text);
            }
            else {
                errorNotification.notification("Try Again1","Error");
            }


        }catch (Exception e ){
            errorNotification.notification("Try Again2","Error");
        }
    }

    @FXML
    void Signup_Cancel(ActionEvent event) {
    guiChangeScreen.ChangeGui_Screen("Login.fxml",id_text);
    }

}
