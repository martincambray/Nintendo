package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;

public class Test 
{
	
	public static void main(String[] args) 
	{
		 Hybride switchConsole = new Hybride("Nintendo Switch");
		 
		 Boutique boutique = new Boutique("Luigi", new Adresse(10, "El Pasta", "Napoli"));
		 
		 List<Achat> achats = new ArrayList();
		 List<Achat> achats2 = new ArrayList();
		 
	     Jeu jeu4 = new Jeu("Pokemon", switchConsole, boutique);
	     Jeu jeu5 = new Jeu("Super Smash Bros", switchConsole, boutique);
	     
	     Collections.addAll(achats, new Achat(jeu1,LocalDate.now(),54.99), new Achat(jeu4,LocalDate.now(),59.99));
	     achats2.add(new Achat(jeu3,LocalDate.now(),29.99));
	     
	     Client client1 = new Client("Dugauguez","Theo", achats);
	     Client client2 = new Client("Cambray","Martin", achats2);
	     Jeu jeu1 = new Jeu("Zelda", switchConsole, boutique);
	     Jeu jeu3 = new Jeu("Rocket league", switchConsole, boutique);
	     Jeu jeu2 = new Jeu("R6", switchConsole, boutique);

	     System.out.println(jeu1);
	     System.out.println(jeu2);
	     System.out.println(jeu3);
	     System.out.println(jeu4);
	     System.out.println(jeu5);
	}
}
