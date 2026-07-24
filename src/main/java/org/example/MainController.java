package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class MainController {

    @FXML private TextField initialCapitalField;
    @FXML private TextField interestRateField;
    @FXML private TextField yearsField;
    @FXML private TextField compoundingFrequencyField;
    @FXML private Label resultLabel;

    @FXML
    private void onCalculateClick() {
        try {
            double capital = Double.parseDouble(initialCapitalField.getText());
            double rate = Double.parseDouble(interestRateField.getText());
            double years = Double.parseDouble(yearsField.getText());


            double result = CompoundInterest.calculate(capital, rate / 100.0, years, 1);

            resultLabel.setText(String.format("Total: € %.2f", result));

        } catch (NumberFormatException e) {
            resultLabel.setText("Please insert valid numbers!!");
        }
    }
}