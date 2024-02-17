package com.example.saddemo.Error;

import com.example.saddemo.Error.IErrorNotification;
import javafx.scene.control.Alert;

public class ErrorNotification implements IErrorNotification {
    @Override
    public void notification(String Error , String title) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(title);
            alert.setHeaderText(title);
            alert.setContentText(Error);
            alert.showAndWait();
        }
    }

