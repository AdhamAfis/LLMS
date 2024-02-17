package com.example.saddemo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GuiChangeScreen implements IGuiChangeScreen {
    @Override
    public void ChangeGui_Screen(String fxmlName, TextField password_text)   {
        try {
            Stage stage = (Stage) password_text.getScene().getWindow();
            Parent Screen = FXMLLoader.load(getClass().getResource(fxmlName));
            Scene scene = new Scene(Screen);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
