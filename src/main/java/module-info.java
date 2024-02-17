module com.example.saddemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.saddemo to javafx.fxml;
    exports com.example.saddemo;
    exports com.example.saddemo.Authentication_Methods;
    opens com.example.saddemo.Authentication_Methods to javafx.fxml;

    exports com.example.saddemo.Error;
    opens com.example.saddemo.Error to javafx.fxml;
}