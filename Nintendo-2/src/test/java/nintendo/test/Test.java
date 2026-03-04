package nintendo.test;

import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;

public class Test 
{
	public static class Console 
	{
	    private String nom;
	    public Console(String nom) 
	    {
	        this.nom = nom;
	    }
	    public String getNom() 
	    {
	        return nom;
	    }
	}
	
	public static class Jeu 
	{
	    private String titre;
	    private Console console;
	    public Jeu(String titre, Console console) 
	    {
	        this.titre = titre;
	        this.console = console;
	    }
	    @Override
	    public String toString() 
	    {
	        return titre + " sur " + console.getNom();
	    }
	}
	
	
	public static void main(String[] args) 
	{
		 Console switchConsole = new Console("Nintendo Switch");
		 
		 Adresse adresse = new Adresse(1,"Rue de la Paix", "Paris");
		 Boutique boutique1 = new Boutique("Boutique 1", adresse);
		 
		 List<Achat> achats = new ArrayList();
		 
	     Jeu jeu1 = new Jeu("Zelda", switchConsole);
	     Jeu jeu2 = new Jeu("R6", switchConsole);
	     Jeu jeu3 = new Jeu("Rocket league", switchConsole);
	     Jeu jeu4 = new Jeu("Pokemon", switchConsole);
	     Jeu jeu5 = new Jeu("Super Smash Bros", switchConsole);
	     
	     Client client1 = new Client("Dugauguez","Theo", achats);
	     Client client2 = new Client("Cambray","Martin", achats);

	     System.out.println(jeu1);
	     System.out.println(jeu2);
	     System.out.println(jeu3);
	     System.out.println(jeu4);
	     System.out.println(jeu5);
	}
}
