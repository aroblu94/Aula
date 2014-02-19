Aula
====

Lo scopo è modellare e realizzare un contesto di gestione di aule per corsi. Le aule
hanno una capienza che va rispettata. Le classi da realizzare sono le seguenti:
+ __Aula__ rappresenta un’aula
+ __Persona__ rappresenta una persona generica (sarà una superclasse di altre seguenti)
+ __Studente__ rappresenta uno studente, ha una matricola
+ __Esterno__ rappresenta un uditore esterno
+ __Docente__ rappresenta un docente, contiene info sulla materia insegnata
+ __Main__ contiene il solo metodo main(), crea due aule di capienza data e propone
  un menu per gestire aule, prenotazioni, ecc. con l’obiettivo di testare tutti i
  metodi almeno una volta).

Tali classi dovranno esporre almeno i metodi specificati nelle sezioni seguenti.
Eventuali metodi di servizio possono essere aggiunti a piacimento.
Ogni classe deve avere il metodo __toString()__ che rappresenti lo stato delle istanze e
i costruttori adeguati per gli attributi che vengono dichiarati.
Creare opportunamente i metodi di accesso agli attributi (__set&get__).
Alcuni __controlli di coerenza__ vengono suggeriti nelle parentesi, potrebbero essercene
altri a discrezione. I tipi di ritorno possono essere variati (ad es. boolean invece di
void se si vuole ottenere un feedback sul successo dell’operazione).

Aula
-----
La classe è caratterizzata dalla capienza massima dell’aula, deve essere possibile assegnarle 
un docente e deve contenere un elenco delle persone prenotate.
Deve avere un costruttore che riceve come parametro la capienza dell’aula e che 
solleva un’eccezione per valori ≤ 0.
Deve esporre i seguenti metodi pubblici:
+ `boolean raggiuntaCapienza()` è stata raggiunta la capienza?
+ `double percentualePrenotati()` percentuale di prenotati su capienza
+ `void assegnaDocente(Docente doc)` assegna un docente (era già stato assegnato?)
+ `void prenota(Persona p)` prenota una certa persona su quest’aula (la persona si
  era già prenotata? E' stata raggiunta la capienza dell’aula?).
+ `void ordina()` mette le prenotazioni in ordine alfabetico per cognome, poi per
  nome.

Persona
-------
Contiene degli attributi, di tipo opportuno, per memorizzare nome, cognome e indirizzo
di mail. Oltre ai costruttori opportuni deve esporre i metodi pubblici di accesso ai
dati.

Esterno
-------
Estende Persona. E un uditore esterno.

Studente
--------
Estende Persona aggiungendo la parte di gestione della matricola; la matricola deve
essere un numero > 0 di tre cifre, altrimenti deve essere sollevata un’eccezione. Oltre
ai costruttori opportuni, la classe deve esporre i metodi pubblici di accesso ai dati.
Docente
Estende Persona aggiungendo la parte di gestione della materia insegnata. Oltre ai
costruttori opportuni deve esporre i metodi pubblici di accesso ai dati.

Main
----
Scrivete una classe Main, contenente il metodo main, che permetta all’utente di creare
e gestire aule e corsi, come segue.
Il programma accetta come parametri in ingresso dalla riga di comando un para-
metro che indica la capienza dell’aula. Per esempio, indica che l’aula avr` capienza 15.
Il programma deve gestire opportunamente il caso in cui la capienza non venga
specificata.
Il programma presenta poi all’utente un menu con le voci:

    (1) Modifica capienza.
    (2) Assegna docente.
    (3) Aggiungi prenotazione.
    (4) Ordina alfabeticamente le prenotazioni.
    (5) Stampa situazione aula.
    (6) Esci.
    
Per ciascun caso il programma deve chiedere all’utente le informazioni per portare
a termine l’operazione (es. nome, ecc. del docente). Il programma esegue l’operazione
richiesta, poi torna al menu, tranne per l’ultima opzione, che permette di uscire dal
programma. Si veda la Figura 1 per un esempio di esecuzione.
