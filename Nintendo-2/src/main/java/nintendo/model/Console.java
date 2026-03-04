package nintendo.model;

import java.time.LocalDate;

public abstract class Console {

  private String nom;
  private double prix;
  private LocalDate releaseDate;

  public Console(String nom, double prix, LocalDate releaseDate) {
    this.nom = nom;
    this.prix = prix;
    this.releaseDate = releaseDate;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  @Override
  public String toString() {
    return "Console [nom=" + nom + ", prix=" + prix + ", releaseDate=" + releaseDate + "]";
  }
}
