package ku.cs.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.models.Student;

public class PrimaryController {
    private Student student;

    @FXML
    public void initialize() {
        student = new Student("Sam");
        student.addScore(50);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary", student);
    }
}
