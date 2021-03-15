package it.polito.tdp.librettovoti;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Libretto;
import model.Voto;

public class FXMLController {
	
	Libretto model = new Libretto();

    @FXML
    private Button btnInserisci;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea txtRisultato;

    @FXML
    void handleInserisci(ActionEvent event) {
    	String nomeEsame= txtNome.getText();
    	String votoEsame= txtVoto.getText();
    	int votoInt= Integer.parseInt(votoEsame);
    	String dataEsame= txtData.getText();
    	LocalDate data= LocalDate.parse(dataEsame);
    	
    	Voto voto= new Voto(nomeEsame, votoInt, data);
    	model.add(voto);
    	
    	txtRisultato.setText(model.toString());
    	
    }
    
    public void setModel(Libretto model) {
    	this.model= model;
    }

}

