package client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ApplicationController {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    Button sendButton;

    public void sendMessage(){
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
