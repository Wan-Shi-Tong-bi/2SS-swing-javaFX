/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAufgabe.aufgabe1;

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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Matthäus
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button button1;
    @FXML
    private AnchorPane anchor;
    
//    private void handleButton(ActionEvent event) throws IOException{
//        
////        Stage s = (Stage) anchor.getScene().getWindow();
////        Parent root1 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
////        Scene scene1 = new Scene(root1);
////        s.setScene(scene1);
////        
//    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cliked(ActionEvent event) throws IOException {
        System.out.println("huhu");
        Stage s = (Stage) anchor.getScene().getWindow();
        Parent root1 = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene1 = new Scene(root1);
        
    }
    
}
