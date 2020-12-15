package uaa.methodologyquiz.controllers;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.*;
import javafx.fxml.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author root
 */
public class IndexController implements Initializable {

    @FXML
    private TextField resultDisplay;

    @FXML
    private Button eigth;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button zero;

    @FXML
    private Button seven;

    @FXML
    private Button point;

    @FXML
    private Button equal;

    @FXML
    private Button min;

    @FXML
    private Button mul;

    @FXML
    private Button div;

    @FXML
    private Button ac;

    @FXML
    private Button plus;

    double input1, result, input2;
    int ps;

    boolean points = false;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Calculator(ActionEvent event) {
        if (event.getSource() == one) { 
            resultDisplay.appendText("1");
        } else if (event.getSource() == two) {
            resultDisplay.appendText("2");
        } else if (event.getSource() == three) {
            resultDisplay.appendText("3");
        } else if (event.getSource() == four) {
            resultDisplay.appendText("4");
        } else if (event.getSource() == five) {
            resultDisplay.appendText("5");
        } else if (event.getSource() == six) {
            resultDisplay.appendText("6");
        } else if (event.getSource() == seven) {
            resultDisplay.appendText("7");
        } else if (event.getSource() == eigth) {
            resultDisplay.appendText("8");
        } else if (event.getSource() == nine) {
            resultDisplay.appendText("9");
        } else if (event.getSource() == zero) {
            resultDisplay.appendText("0");
        }else if (event.getSource() == ac) {

            resultDisplay.setText("");
            input1 = 0;
            input2 = 0;
            points = false;
            result = 0;
            ps = 0;

        } else if (event.getSource() == point && points == false) {

            resultDisplay.appendText(".");
            points = true;

        } else if (event.getSource() == plus) {

            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 1;
            points = false;

        } else if (event.getSource() == plus) {

            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 1;
            points = false;

        } else if (event.getSource() == min) {

            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 2;
            points = false;

        } else if (event.getSource() == div) {

            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 3;
            points = false;

        } else if (event.getSource() == mul) {

            input1 = Double.parseDouble(resultDisplay.getText());
            resultDisplay.setText("");
            ps = 4;
            points = false;

        } else if (event.getSource() == equal && ps > 0) {

            input2 = Double.parseDouble(resultDisplay.getText());
            DecimalFormat td = new DecimalFormat("#.00");

            switch (ps) {
                case 1:
                    result = input1 + input2;
                    resultDisplay.setText(String.valueOf(td.format(result)));
                    break;
                case 2:
                    result = input1 - input2;
                    resultDisplay.setText(String.valueOf(td.format(result)));
                    break;
                case 3:
                    result = input1 / input2;
                    resultDisplay.setText(String.valueOf(td.format(result)));
                    break;
                case 4:
                    result = input1 * input2;
                    resultDisplay.setText(String.valueOf(td.format(result)));
                    break;

            }
            ps = 0;
    }

}
