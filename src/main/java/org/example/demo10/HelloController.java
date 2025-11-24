package org.example.demo10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField leftText;

    @FXML
    private TextField rightText;

    @FXML
    private Button arrowButton;

    private boolean isRight = true;

    public void onArrowButtonClick(ActionEvent event) {
        if (isRight) {
            String text = leftText.getText();
            rightText.setText(text);
            leftText.setText("");
            arrowButton.setText("←");
        } else {
            String text = rightText.getText();
            leftText.setText(text);
            rightText.setText("");
            arrowButton.setText("→");
        }

        leftText.setDisable(isRight);
        isRight = !isRight;
        rightText.setDisable(isRight);
    }
}