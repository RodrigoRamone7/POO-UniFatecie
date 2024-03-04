/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package relogiojavafx;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Impressão
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label dataHoraAtual;
    private Button botaoDataHora;
    
    @FXML
    private void dataHoraAtual(ActionEvent event) {
        Date relogio = new Date();
        dataHoraAtual.setText(relogio.toString());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
