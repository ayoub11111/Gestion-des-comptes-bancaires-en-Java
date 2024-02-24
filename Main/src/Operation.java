import java.util.Date;

public class Operation {

    public static final String TYPE_VERS = "VERS";
    public static final String TYPE_RETIRER = "RETIRER";

    private Date date;
    private String type;
    private double montant;
    // la relation qui contient une seule référence avec un compte bancaire
    private Compte compte;

    public Operation() {

    }

    // constructeur avec parametre
    public Operation(Date date, String type, double montant, Compte c) {
        this.date = date;
        this.type = type;
        this.montant = montant;
        this.compte = c;
    }

    // getters et setters pour les attributs de l'objet operation
    // date
    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        date = d;
    }

    // type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // montant
    public double getMontant() {
        return montant;
    }

    public void setMontant(double m) {
        this.montant = m;
    }

    // Compte
    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

}
