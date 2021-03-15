package it.polito.tdp.librettovoti;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
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

   // @FXML
   // private TextField txtData;

    @FXML
    private DatePicker pickerEsame;
    
    @FXML
    private TextArea txtRisultato;

    @FXML
    void handleInserisci(ActionEvent event) {
    	String nomeEsame= txtNome.getText();
    	
    	if(nomeEsame.length()==0) {
    		txtRisultato.setText("ERRORE: nome esame vuoto");
    		return;
    	}
    	String votoEsame= txtVoto.getText();
    	int votoInt=0;
    	try {
    		votoInt= Integer.parseInt(votoEsame);
    	}
    	catch(NumberFormatException e) {
    		txtRisultato.setText("ERRORE: il voto deve essere numerico");
    		return;
    	}
    	if(votoInt<18 || votoInt>30) {
    		txtRisultato.setText("ERRORE: il voto deve essre compreso tra 18 e 30");
    		return;
    	}
    	
    	
    	/*String dataEsame= txtData.getText();
    	LocalDate data;
    	try{
    		data = LocalDate.parse(dataEsame);
    	}catch(DateTimeParseException e) {
    		txtRisultato.setText("ERRORE: il formato della data non è corretto");
    		return;
    		
    	}*/
    	LocalDate data= pickerEsame.getValue();
    	if(data== null) {
    		txtRisultato.setText("ERRORE: la data è errata o mancante");
    	}
    	Voto voto= new Voto(nomeEsame, votoInt, data);
    	model.add(voto);
    	
    	txtRisultato.setText(model.toString());
    	
    	txtNome.clear();
    	txtVoto.clear();
    	pickerEsame.setValue(null);
    	
    }
    
    public void setModel(Libretto model) {
    	this.model= model;
    }

}

