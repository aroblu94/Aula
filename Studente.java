import java.util.*;

public class Studente extends Persona {

	//CAMPI
	private String matricola;

	//COSTRUTTORE
	public Studente(String n, String c, String e, String m) {
		super(n,c,e);
		if(m.length() >= 3)
			matricola = m;
		else
			System.out.println("Matricola non valida ");
	}

	//METODI
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String m) {
		matricola = m;
	}

	public String toString() {
		return super.toString() + "  Matricola: " + matricola + "\n";
	}



}