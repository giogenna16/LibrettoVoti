package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Libretto {
	
	private Set<Voto> voti;
	
	public Libretto() {
		this.voti= new HashSet<>();
		
	}

	public void add(Voto v) {
		this.voti.add(v);
		
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
	
	/*public List<Voto> votiUguali2(int punteggio){
		
	
		List<Voto> risultato= new ArrayList<>();
		
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio)
			   risultato.add(v);
		
			
		
		
		}
		return risultato;
	}*/
	/**
	 * Ricerca un Voto del corso di cui è specificato il nome
	 * se il corso non esiste: null
	 * @param nomeCorso
	 * @return
	 */
	
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato= null;
		for(Voto v: this.voti) {
			if(v.getNome().equals(nomeCorso)) {
				risultato =v;
				break;
			}
		}
		return risultato;
	}
	
	public boolean controlloPresenteNomeVoto(Voto daAggiungere){
		boolean presente= false;
		
		for(Voto v: this.voti) {
			if(v.getVoto()== daAggiungere.getVoto() && v.getNome().equals(daAggiungere.getNome())) {
				presente = true;
				break;
			}
		}
		
		return presente;	
	}
	
	public boolean controlloPresenteNome(Voto daAggiungere){
        boolean presente= false;
		
		for(Voto v: this.voti) {
			if(v.getVoto()!= daAggiungere.getVoto() && v.getNome().equals(daAggiungere.getNome())) {
				presente = true;
				break;
			}
		}
		
		return presente;	
		
	}
	
	
}
