package nintendo.model;
import java.time.LocalDate;

public class Achat 
{
    private Jeu jeu;
    private LocalDate date;
    private double prix;
    public Achat(Jeu jeu, LocalDate date, double prix) 
    {
        this.jeu = jeu;
        this.date = date;
        this.prix = prix;
    }
    @Override
    public String toString() 
    {
        return "Achat de " + jeu + " le " + date + " pour " + prix + "€";
    }
}