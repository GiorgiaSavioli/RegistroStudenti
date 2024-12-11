package registro;
import java.util.ArrayList;


public class Registro {
	
	public class RegistroStudenti {
	    private ArrayList<Studente> studenti; //array per salvare gli oggetti della classe studente

	    public RegistroStudenti() {
	    studenti = new ArrayList<>();
	    }
	    
	    public void aggiungiNuovoStudente(String nome, String cognome, int matricola) { //metodo aggiungiNuovoStudente
	        Studente Studente1 = new Studente(nome, cognome, matricola);
	        studenti.add(Studente1);	 // Aggiunge lo studente all'ArrayList
	    }
	   
	    	
		public void visualizzaStudente () {   // metodo per visualizzare studente dall'ArrayList
			for (int i = 0; i<studenti.size(); i++) {
				Studente studente = studenti.get(i);
				System.out.println("Nome: " + studente.nome + ", cognome: " + studente.cognome + ", Matricola: " + studente.matricola);
			}
		}
    	
		public void cercaMatricola (int matricola) {   //metodo per cercare uno studente attraverso la matricola
    	for (int i = 0; i<studenti.size(); i++) {		//anche qui non riesco a richiamare l'attributo matricola di studente
    		if (studenti.matricola(matricola)) {
    		}	
    	}
		}
}
}
   
	