package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField searchField;

    @FXML
    private void create(ActionEvent actionEvent) {
        if (searchField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Invalid Entry", "Please input your ingredients");
        }
        else {
            AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "Match Found", "Here are your options");
        }
    }

    public void showNewNoteDialog(ActionEvent actionEvent) {
    }
}
