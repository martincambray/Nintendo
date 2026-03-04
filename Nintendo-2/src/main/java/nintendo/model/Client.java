package nintendo.model;

public class Client {
  protected String nom;
  protected String prenom;

  @Override
  public String toString() {
    return "Client [nom=" + nom + ", prenom=" + prenom + "]";
  }

  public Client(String prenom, String nom) {
    this.prenom = prenom;
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
}
