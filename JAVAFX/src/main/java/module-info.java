module com.example.JAVAFX {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.JAVAFX to javafx.fxml;
    exports com.example.JAVAFX;
}