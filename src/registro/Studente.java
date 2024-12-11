package registro;

import java.util.ArrayList;

/* Gestione di un Registro di Studenti
Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:

Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma
 * */
public class Studente {
//attributi della classe studente
	public String nome = " ";
	public String cognome = " ";
	public int matricola;
	
	
	public Studente (String nome, String cognome, int matricola) {  
		this.nome = nome; 			 //assegnazione p
		this.cognome = cognome;
		this.matricola = matricola;
	}
}


