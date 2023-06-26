module com.example.appdb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.appdb to javafx.fxml;
    exports com.example.appdb;
}