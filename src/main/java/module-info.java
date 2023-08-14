module com.example.crudjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crudjavafx to javafx.fxml;
    exports com.example.crudjavafx;
}