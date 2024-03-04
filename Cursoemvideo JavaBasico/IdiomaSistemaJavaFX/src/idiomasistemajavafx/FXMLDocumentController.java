/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package idiomasistemajavafx;

import java.net.URL;
import java.util.Locale;
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
    private Label idiomaSistema;
    private Button idiomaBotao;
    
    @FXML
    private void clicouBotao(ActionEvent event){
        Locale idioma = Locale.getDefault();
        idiomaSistema.setText(idioma.getDisplayLanguage().toString());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
