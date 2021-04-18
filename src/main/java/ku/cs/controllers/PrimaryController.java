package ku.cs.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.App;
import ku.cs.models.Number;

public class PrimaryController {

    @FXML
    private Label numberLabel;

    private Number number;

    @FXML
    public void initialize() {
        number = new Number();
    }

    @FXML
    public void handleReadButton(ActionEvent e) {
        numberLabel.setText("Number: " + number.getNumber());
    }

    @FXML
    public void handleIncreaseButton(ActionEvent e) {
        number.increase();
        handleReadButton(e);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
