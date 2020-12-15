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
        } 

    }

}
