import java.util.*;

public class Docente extends Persona {

	//CAMPI
	private String materia;

	//COSTRUTTORE
	public Docente(String n, String c, String e, String m) {
		super(n,c,e);
		materia = m;
	}

	//METODI
	public String getMateria() {
		return materia;
	}

	public String toString() {
		return super.toString() + "Materia: " + materia + "\n";
	}


}