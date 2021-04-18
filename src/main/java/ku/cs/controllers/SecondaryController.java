package ku.cs.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.App;
import ku.cs.models.Student;

public class SecondaryController implements ReceiveData {
    private Student student;
    @FXML private Label dataLabel;


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @Override
    public void initData(Object data) {
        student = (Student) data;
    }

    @FXML
    public void handleShowDataButton(ActionEvent e) {
        dataLabel.setText(student.toString());
    }
}