package model;

import java.time.LocalDate;

//POJO Plain Old Java Object
//Java Bean
// Semplice contenitore di dati -- non ha "logica"

/**
 * Memorizza il risultato di un esame singolo
 * 
 * @author genna
 *
 */
public class Voto {

	private String nome;
	private int voto; //30L?!?!
	private LocalDate data; //data sup esame
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame: nome=" + nome + ", voto=" + voto + ", data=" + data;
	}

	
}
