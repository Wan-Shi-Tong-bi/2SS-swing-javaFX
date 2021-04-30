/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAufgabe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author bgaubinger17
 */
public class FXMLDocumentController implements Initializable {
     
    @FXML
    private Button okButton;
    @FXML
    private Button zuruck_button;
    @FXML
    private AnchorPane anchor;
    @FXML
    private TextField field;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void zurueck(ActionEvent event) throws IOException {
        Stage s = (Stage) anchor.getScene().getWindow();
        Parent root1 = FXMLLoader.load(getClass().getResource("Abfrage.fxml"));
        Scene scene1 = new Scene(root1);
        s.setScene(scene1);
        s.show();
        
    }

    @FXML
    private void ok(ActionEvent event) throws IOException {
        System.out.println("2222");
        Stage s = (Stage) anchor.getScene().getWindow();
        Parent root1 = FXMLLoader.load(getClass().getResource("Window2.fxml"));
        Scene scene1 = new Scene(root1);
        s.setScene(scene1);
        s.show();
        String text = field.getText();
        Label label = (Label) s.getScene().lookup("#zahl");
        label.setText("Zahl:" + text);
    }
    
}
