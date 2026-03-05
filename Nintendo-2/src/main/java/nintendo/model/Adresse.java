package nintendo.model;

public class Adresse {
	
	private int numero;
	private String rue;
	private String ville;
	
	public Adresse(int numero, String rue, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", ville=" + ville + "]";
	}

}
