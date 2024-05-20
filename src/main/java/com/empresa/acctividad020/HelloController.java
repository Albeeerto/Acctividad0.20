package com.empresa.acctividad020;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField num1Field;

    @FXML
    private TextField num2Field;

    @FXML
    private Label resultLabel;

    @FXML
    private Button andButton;

    @FXML
    private Button orButton;

    @FXML
    private Button xorButton;

    @FXML
    private Button notButton;

    @FXML
    private Button shiftLeftButton;

    @FXML
    private Button shiftRightButton;

    @FXML
    public void initialize() {
        andButton.setOnAction(e -> performBitwiseOperation("AND"));
        orButton.setOnAction(e -> performBitwiseOperation("OR"));
        xorButton.setOnAction(e -> performBitwiseOperation("XOR"));
        notButton.setOnAction(e -> performBitwiseOperation("NOT"));
        shiftLeftButton.setOnAction(e -> performBitwiseOperation("SHIFT_LEFT"));
        shiftRightButton.setOnAction(e -> performBitwiseOperation("SHIFT_RIGHT"));
    }

    private void performBitwiseOperation(String operation) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = 0;

            switch (operation) {
                case "AND":
                    result = num1 & num2;
                    break;
                case "OR":
                    result = num1 | num2;
                    break;
                case "XOR":
                    result = num1 ^ num2;
                    break;
                case "NOT":
                    result = ~num1;
                    break;
                case "SHIFT_LEFT":
                    result = num1 << num2;
                    break;
                case "SHIFT_RIGHT":
                    result = num1 >> num2;
                    break;
            }
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Porfavor inserta un número válido.");
        }
    }
}