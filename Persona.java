import java.util.*;

public abstract class Persona implements Comparable<Persona>{

	//CAMPI
	private String nome, cognome, email;

	//COSTRUTTORE
	public Persona(String n, String c, String e) {
		nome = n;
		cognome = c;
		if(e.contains("@"))
			email = e;
		else
			System.out.println("email non valida ");
	}

	//METODI
	public int compareTo(Persona p) {
		if(this.getCognome().equals(p.getCognome()))
			return this.getNome().compareTo(p.getNome());
		else return this.getCognome().compareTo(p.getCognome());
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + " " + cognome + "\n");
		sb.append("  email: " + email + "\n");
		return sb.toString();
	}


}