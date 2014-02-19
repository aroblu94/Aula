import java.util.*;

public class Esterno extends Persona {

	//CAMPI


	//COSTRUTTORE
	public Esterno(String n, String c, String e) {
		super(n,c,e);
	}

	//METODI
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNome() + " " + super.getCognome() + " (esterno) \n");
		sb.append("  email: " + super.getEmail() + "\n");
		return sb.toString();
	}


}