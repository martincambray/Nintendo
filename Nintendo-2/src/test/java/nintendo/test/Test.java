package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;

public class Test {
  public static class Console {
    private String nom;

    public Console(String nom) {
      this.nom = nom;
    }

    public String getNom() {
      return nom;
    }
  }

  public static class Jeu {
    private String titre;
    private Console console;

    public Jeu(String titre, Console console) {
      this.titre = titre;
      this.console = console;
    }

    @Override
    public String toString() {
      return titre + " sur " + console.getNom();
    }
  }

  public static void main(String[] args) {
    Console switchConsole = new Console("Nintendo Switch");

    Jeu jeu1 = new Jeu("Zelda", switchConsole);
    Jeu jeu2 = new Jeu("R6", switchConsole);
    Jeu jeu3 = new Jeu("Rocket league", switchConsole);
    Jeu jeu4 = new Jeu("Pokemon", switchConsole);
    Jeu jeu5 = new Jeu("Super Smash Bros", switchConsole);

    System.out.println(jeu1);
    System.out.println(jeu2);
    System.out.println(jeu3);
    System.out.println(jeu4);
    System.out.println(jeu5);
    Boutique boutique = new Boutique("Luigi", new Adresse(10, "El Pasta", "Napoli"));
  }
}
