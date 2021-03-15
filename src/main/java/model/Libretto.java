package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Libretto {
	
	private List<Voto> voti;
	private Map<String, Voto> votiMap;
	
	public Libretto() {
		this.voti= new ArrayList<>();
		this.votiMap= new HashMap<>();
	}

	public void add(Voto v) {
		this.voti.add(v);
		this.votiMap.put(v.getNome(), v);
		
	}
	
	public  String toString() {
		String s= "";
		for(Voto v: this.voti) {
			s=s+ v.toString()+"\n";
		}
		
		return s;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato= new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
		
	}
	
	
	/**
	 * Ricerca un Voto del corso di cui è specificato il nome
	 * se il corso non esiste: null
	 * @param nomeCorso
	 * @return
	 */
	
	public Voto ricercaCorso(String nomeCorso) {
		return this.votiMap.get(nomeCorso);
	}
	
	public boolean controlloPresenteNomeVoto(Voto daAggiungere){
		
		
		Voto trovato= this.votiMap.get(daAggiungere.getNome());
		
		if(trovato==null)
			return false;
		if(trovato.getVoto()==daAggiungere.getVoto())
			return true;
		else
			return false;
	}
	
	public boolean controlloPresenteNome(Voto daAggiungere){
        
		Voto trovato= this.votiMap.get(daAggiungere.getNome());
		
		if(trovato==null)
			return false;
		if(trovato.getVoto()!=daAggiungere.getVoto())
			return true;
		else
			return false;
		
	}
	
	
}
