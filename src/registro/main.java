

/*esercizio incompleto, ho riscontrato dei problemi nella creazione dei metodi.
 * non sono riuscita a completare il resto, quindi non viene stampata neanche la */

package registro;
import java.util.Scanner;

import registro.Registro.RegistroStudenti;

public class main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Registro registro = new Registro();   //è necessario creare un oggetto della classe registro per accedere ai metodi della classe reistro
		boolean stampare = true;
		
		while (stampare) {
			System.out.println("1. Aggiungere uno studente?");         //menu di azioni tra le quali l'utente può scegliere
			System.out.println("2. Visualizzare tutti gli studenti?");
			System.out.println("3. Cercare uno studente per matricola?");
			System.out.println("4. Uscire dal programma?");
			
			
			int menu = scanner.nextInt();
			switch (menu) {  					//switch per la scelta dell'azione che si vuole compiere
			
			case 1: 
				System.out.println("Inserire il nome");
				String nome = scanner.nextLine();
				System.out.println();
				System.out.println("Inserire il cognome");
				String cognome = scanner.nextLine();
				System.out.println("Inserire la matricola");
				int matricola = scanner.nextInt();
				break;
				
				case 2: 
				studenti.visualizzaStudente();   	/*scelta per la visualizzazione degli studenti,
													non mi richiama il metodo presente nel registro
													per poter visualizzare gli studenti */
			
			case 3: 
				 System.out.print("Inserire la matricola da cercare: ");
                 int matricolaDaCercare = scanner.nextInt();
                 break;
			case 4: 
				 System.out.println("Uscire dal programma?");
                 break;

             default:
                 System.out.println("Scelta errata, riprovare."); 
			}
			}
		}
	}

