module com.example.proyecto3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires MapsJava;
    requires com.fasterxml.jackson.databind;


    opens com.example.proyecto3 to javafx.fxml;
    exports com.example.proyecto3;
}