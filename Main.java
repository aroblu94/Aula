import java.util.*;

public class Main {

	public static boolean debug = true;

	public static void main(String[] args) {
		int selettore;

		//creo l'aula con un solo posto (verrà poi modificato dall'utente)
		Aula aula = new Aula("V1",1);

		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Scegli cosa vuoi fare: ");
			System.out.println("(1) Modifica capienza \n    N.B. per default la capienza è impostata a 1, prego modificare. ");
			System.out.println("(2) Assegna docente ");
			System.out.println("(3) Aggiungi prenotazione ");
			System.out.println("(4) Ordina alfabeticamente le prenotazioni ");
			System.out.println("(5) Stampa situazione aula ");
			System.out.println("(6) Esci ");
			System.out.println();
			selettore = Integer.parseInt(in.next());

			switch(selettore) {
				case 1:
					System.out.println("Inserisci la nuova capienza dell'aula ");
					int capienza = Integer.parseInt(in.next());
					aula.setCapienza(capienza);
					System.out.println();
					break;
				case 2:
					System.out.println("Inserisci il docente da assegnare (nome, cognome, email, materia) ");
					String nome = in.next();
					String cognome = in.next();
					String email = in.next();
					String materia = in.next();
					Docente doc = new Docente(nome,cognome,email,materia);
					aula.assegnaDocente(doc);
					System.out.println();
					break;
				case 3:
					System.out.println("E' uno studente? (s/n) ");
					if(in.next().toUpperCase().equals("N")) {
						System.out.println("Inserisci l'esterno da prenotare (nome, cognome, email) ");
						nome = in.next();
						cognome = in.next();
						email = in.next();
						Esterno e = new Esterno(nome,cognome,email);
						aula.prenota(e);
						System.out.println();
					}
					else {
						System.out.println("Inserisci lo studente da prenotare (nome, cognome, email, matricola) ");
						nome = in.next();
						cognome = in.next();
						email = in.next();
						String matricola = in.next();
						Studente stud = new Studente(nome,cognome,email,matricola);
						aula.prenota(stud);
						System.out.println();
					}
					break;
				case 4:
					System.out.println("Sto ordinando le prenotazioni ...");
					System.out.println();
					aula.ordina();
					break;
				case 5:
					System.out.println(aula);
					System.out.println("Lista prenotati: ");
					System.out.println(aula.listaPrenotati());
					System.out.println();
					break;
				case 6:
					System.out.println("Uscita ...");
					System.exit(0);
					break;
			}
		}
	}
}