import java.util.*;

public class Aula implements Iterable<Persona>{

	//CAMPI
	private int capienza;
	private String nome;
	private Docente docente = null;
	private Vector<Persona> prenotati;

	//COSTRUTTORE
	public Aula(String n, int c) {
		nome = n;
		prenotati = new Vector<Persona>();
		if(c > 0)
			capienza = c;
		else
			throw new IllegalArgumentException("Capienza non valida");
	}

	//METODI
	public boolean raggiuntaCapienza() {
		return prenotati.size() == capienza;
	}

	public double percentualePrenotati() {
		return prenotati.size()/capienza*100;
	}

	public void assegnaDocente(Docente doc) {
		if(docente == null)
			docente = doc;
		else 
			System.out.println("Docente già presente ");
	}

	public void prenota(Persona p) {
		boolean prenotato = false;
		for(Persona x : prenotati) {
			if(x.getEmail().equals(p.getEmail())) {
				prenotato = true;
				break;
			}
		}
		if(prenotato)
			System.out.println("Persona gia' prenotata ");
		else if(!prenotato && prenotati.size() < capienza)
			prenotati.addElement(p);
		else
			System.out.println("Superata la capacita' dell'aula ");
	}

	public void ordina() {
		Collections.sort(prenotati);
	}

	public Iterator<Persona> iterator() {
		return prenotati.iterator();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("AULA " + nome + "\n");
		sb.append("Capienza: " + capienza + "\n");
		if(docente == null)
			sb.append("Docente: - \n");
		else
			sb.append("Docente: " + docente + "\n");
		sb.append("Numero prenotati: " + prenotati.size() + "\n");
		sb.append("Percentuale prenotati su capacita': " + percentualePrenotati() + "% \n");
		return sb.toString();
	}

	public String listaPrenotati() {
		StringBuilder sb = new StringBuilder();
		for(Persona x : prenotati) {
			sb.append("  " + x + "\n");
		}
		return sb.toString();
	}

	//metodi set & get ...
	public Vector<Persona> getVettore() {
		return prenotati;
	}

	public void setCapienza(int c) {
		if(c > 0)
			capienza = c;
		else
			throw new IllegalArgumentException("Capienza non valida");
	}



}