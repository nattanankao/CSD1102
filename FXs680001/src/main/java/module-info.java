module com.example.fxs680001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxs680001 to javafx.fxml;
    exports com.example.fxs680001;
}