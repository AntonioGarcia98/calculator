package uaa.methodologyquiz.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import uaa.methodologyquiz.MainApp;
import uaa.methodologyquiz.enums.FxmlEnum;

/**
 * FXML Controller class
 *
 * @author root
 */
public class IndexController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void startQuiz() throws IOException {
        MainApp.changeScene(FxmlEnum.QUIZ);
    }
    
    @FXML
    private void seeMethodologies() throws IOException {
        MainApp.changeScene(FxmlEnum.METHODOLOGIES);
    }
    
}
