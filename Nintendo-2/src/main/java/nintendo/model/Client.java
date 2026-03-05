package nintendo.model;

import java.util.List;

public class Client {
  protected String nom;
  protected String prenom;
  protected List<Achat> listeAchats;

  public Client(String prenom, String nom, List<Achat> listeAchats) {
    this.prenom = prenom;
    this.nom = nom;
    this.listeAchats = listeAchats;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  @Override
  public String toString() {
	return "Client [nom=" + nom + ", prenom=" + prenom + ", listeAchats=" + listeAchats + "]";
  }
  
  
}
