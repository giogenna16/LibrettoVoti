package model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	
	public static void main (String[] args) {
		

	    Libretto libretto= new Libretto();
	    Libretto librettoMigliorato= new Libretto();
	
	    Voto voto1= new Voto("Analisi 1", 30, LocalDate.of(2019,2,15));
	
	    libretto.add(voto1);
	    libretto.add(new Voto("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
	    libretto.add(new Voto("Informatica", 24, LocalDate.of(2019, 9, 15)));
	
	    libretto.add(new Voto("Chimica", 25, LocalDate.of(2019, 1, 30)));
	    System.out.println(libretto);
	    
	   
	   
	    Libretto librettoVenticinque= libretto.votiUguali(25);
	    System.out.println(librettoVenticinque);
	    
	    
	  	Voto votoPresente= new Voto("Chimica", 25, LocalDate.of(2019, 1, 30));
	    if(libretto.controlloPresenteNomeVoto(votoPresente))
	    	System.out.println("L'esame '"+votoPresente+"' è gia presente nel Libretto (stesso esame e stesso voto)");
	    else
	    	System.out.println("L'esame '"+votoPresente+"' non è presente nel Libretto");
	   
	    
	    Voto votoIncompatibile= new Voto("Chimica", 18, LocalDate.of(2019, 1, 30));
	    if(libretto.controlloPresenteNome(votoIncompatibile))
	    	System.out.println("L'esame '"+votoIncompatibile+"' è gia presente nel Libretto, ma con voto diverso");
	    else
	    	System.out.println("L'esame '"+votoIncompatibile+"' non è presente nel Libretto");
	    
	    System.out.println("\n\n");
	    
	    Voto votoIncompatibile1= new Voto("Chimica", 18, LocalDate.of(2019, 1, 26));
		Voto votoIncompatibile2= new Voto("Chimica", 25, LocalDate.of(2019, 1, 23));
		Voto voto2= new Voto("Analisi 2", 23, LocalDate.of(2019,2,25));
		Voto voto2Copia= new Voto("Analisi 2", 30, LocalDate.of(2019,2,5));
		libretto.add(votoIncompatibile1);
		libretto.add(votoIncompatibile2);
		libretto.add(voto2);
		libretto.add(voto2Copia);
		System.out.println(libretto);
	}
	
	
}
