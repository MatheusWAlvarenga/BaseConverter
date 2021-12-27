package baseconverter;

import baseconverter.model.Bases;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


/**
 *
 * @author MatheusWilliam
 */
public class FXMLDocumentController implements Initializable {

    
    @FXML
    private Label lblResult, lblTxt, lblInput, lblButtons;
    
    @FXML
    private Button buttonDecimal, buttonOctal, buttonBinario, buttonHexa;
    
    @FXML
    private TextField lblField;
    
    @FXML
    private ComboBox<Bases> cbBases;
    private final List<Bases> bases = new ArrayList<>();
    private ObservableList<Bases> obsBases;

    @FXML
    private void buttonDecimalAction(ActionEvent event) {
        lblResult.setText("");
        lblTxt.setText(""); 
        lblResult.setTextFill(Color.web("#111111"));
        if (cbBases.getValue().toString() ==  "Octal") {
                try{ String oct = lblField.getText();
                int converted =  Integer.parseInt ( oct , 8);
                lblTxt.setText("O número correspondente em decimal é: ");
                lblResult.setText(Integer.toString(converted));
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número octal válido!");
                } 
        } else if (cbBases.getValue().toString() ==  "Binário"){
                try{ String bin = lblField.getText();
                int converted =  Integer.parseInt ( bin , 2);
                lblTxt.setText("O número correspondente em decimal é: ");
                lblResult.setText(Integer.toString(converted));
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número binário válido!");
                }
        } else if (cbBases.getValue().toString() ==  "Hexadecimal"){
                try { String hex = lblField.getText();
                int converted =  Integer.parseInt ( hex , 16);
                lblTxt.setText("O número correspondente em decimal é: ");
                lblResult.setText(Integer.toString(converted));
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número Hexadecimal válido!");
                }
        }
    }
    
    @FXML
    private void buttonOctalAction(ActionEvent event) {
        lblResult.setText("");
        lblTxt.setText("");   
        lblResult.setTextFill(Color.web("#111111"));
        if (cbBases.getValue().toString() ==  "Decimal"){
                try{ int dec = Integer.parseInt(lblField.getText());
                String converted =  Integer.toOctalString(dec);
                lblTxt.setText("O número correspondente em octal é: ");
                lblResult.setText(converted);
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número decimal válido!");
                }
        } else if (cbBases.getValue().toString() ==  "Binário"){
                try { String bin = lblField.getText();
                int convertedDecimal =  Integer.parseInt ( bin , 2);
                String converted = Integer.toOctalString(convertedDecimal);
                lblTxt.setText("O número correspondente em octal é: ");
                lblResult.setText(converted);
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número binário válido!");
                }
        } else if (cbBases.getValue().toString() ==  "Hexadecimal"){
                try{ String hex = lblField.getText();
                int convertedDecimal =  Integer.parseInt ( hex , 16);
                String converted = Integer.toOctalString(convertedDecimal);
                lblTxt.setText("O número correspondente em octal é: ");
                lblResult.setText(converted);
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número Hexadecimal válido!");
                }
        }
    }
    
    @FXML
    private void buttonBinarioAction(ActionEvent event) {
        lblResult.setText("");
        lblTxt.setText(""); 
        lblResult.setTextFill(Color.web("#111111"));
        if (cbBases.getValue().toString() ==  "Decimal"){
                try{ int dec = Integer.parseInt(lblField.getText());
                String converted =  Integer.toBinaryString(dec);
                lblTxt.setText("O número correspondente em binário é: ");
                lblResult.setText(converted);
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número decimal válido!");
                }
        } else if (cbBases.getValue().toString() ==  "Octal"){
                try{ String oct = lblField.getText();
                int convertedDecimal =  Integer.parseInt ( oct , 8);
                String converted = Integer.toBinaryString(convertedDecimal);
                lblTxt.setText("O número correspondente em binário é: ");
                lblResult.setText(converted);
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número octal válido!");
                }
        } else if (cbBases.getValue().toString() ==  "Hexadecimal"){
                try{ String hex = lblField.getText();
                int convertedDecimal =  Integer.parseInt ( hex , 16);
                String converted = Integer.toBinaryString(convertedDecimal);
                lblTxt.setText("O número correspondente em binário é: ");
                lblResult.setText(converted);
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número Hexadecimal válido!");
                }
        }
    }
    
    @FXML
    private void buttonHexaAction(ActionEvent event) {
        lblResult.setText("");
        lblTxt.setText("");   
        lblResult.setTextFill(Color.web("#111111"));
        if (cbBases.getValue().toString() ==  "Decimal"){
                try{ int dec = Integer.parseInt(lblField.getText());
                String converted =  Integer.toHexString(dec);
                lblTxt.setText("O número correspondente em hexadecimal é: ");
                lblResult.setText(converted.toUpperCase());
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número decimal válido!");
                }
        } else if (cbBases.getValue().toString() ==  "Octal"){
                try{ String oct = lblField.getText();
                int convertedDecimal =  Integer.parseInt ( oct , 8);
                String converted = Integer.toHexString(convertedDecimal);
                lblTxt.setText("O número correspondente em hexadecimal é: ");
                lblResult.setText(converted);
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número octal válido!");
                }
        } else if (cbBases.getValue().toString() ==  "Binário"){
                try{
                    String bin = lblField.getText();
                    int convertedDecimal =  Integer.parseInt ( bin , 2);
                    String converted = Integer.toHexString(convertedDecimal);
                    lblTxt.setText("O número correspondente em hexadecimal é: ");
                    lblResult.setText(converted.toUpperCase());
                } catch (NumberFormatException e){
                    lblResult.setTextFill(Color.web("#DE0134"));
                    lblResult.setText("Digite um número binário válido!");
                }
        }
    }
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadCategory();
       
    }
    
    public void enableButton() {
        lblResult.setText("");
        lblTxt.setText("");  
        if (cbBases.getValue().toString() =="Decimal") {
                lblButtons.setDisable(false);
                lblField.setDisable(false);
                lblInput.setDisable(false);
                lblInput.setText("Digite um número decimal");
                buttonDecimal.setDisable(true);
                buttonOctal.setDisable(false);
                buttonBinario.setDisable(false);
                buttonHexa.setDisable(false);
        } else if (cbBases.getValue().toString() =="Octal") {
                lblButtons.setDisable(false);
                lblField.setDisable(false);
                lblInput.setDisable(false);
                lblInput.setText("Digite um número Octal");
                buttonDecimal.setDisable(false);
                buttonOctal.setDisable(true);
                buttonBinario.setDisable(false);
                buttonHexa.setDisable(false);
        } else if (cbBases.getValue().toString() =="Binário") {
                lblButtons.setDisable(false);
                lblField.setDisable(false);
                lblInput.setDisable(false);
                lblInput.setText("Digite um número Binário");
                buttonDecimal.setDisable(false);
                buttonOctal.setDisable(false);
                buttonBinario.setDisable(true);
                buttonHexa.setDisable(false);
        } else if (cbBases.getValue().toString() =="Hexadecimal") { 
                lblButtons.setDisable(false);
                lblField.setDisable(false);
                lblInput.setDisable(false);
                lblInput.setText("Digite um número Hexadecimal");
                buttonDecimal.setDisable(false);
                buttonOctal.setDisable(false);
                buttonBinario.setDisable(false);
                buttonHexa.setDisable(true);
        }
    }    
    
    public void loadCategory() {
        
        Bases baseItem1 = new Bases(1,"Decimal");
        Bases baseItem2 = new Bases(2,"Octal");
        Bases baseItem3 = new Bases(3,"Binário");
        Bases baseItem4 = new Bases(4,"Hexadecimal");
        
        bases.add(baseItem1);
        bases.add(baseItem2);
        bases.add(baseItem3);
        bases.add(baseItem4);
        
        obsBases = FXCollections.observableArrayList(bases);
        
        cbBases.setItems(obsBases);
        
    }
    
}
