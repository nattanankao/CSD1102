package com.example.fxs680001;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Gui3Controller {
    @FXML
    private TextField Nametext;

    @FXML
    private TextField Addresstext;

    @FXML
    private TextField Phonetext;

    @FXML
    private TextArea Areatext;

    @FXML
    private void Submittext() {

        String name = Nametext.getText();
        String address = Addresstext.getText();
        String phone = Phonetext.getText();

        Areatext.setText("Name: " + name +
                "\nAddress: " + address +
                "\nPhone Number: " + phone);
    }
}
