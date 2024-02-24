public class Client {

    private int id;
    private String nom;
    private String prenom;
    // la relations qui contient une seule référence vers un Compte
    private Compte compte;

    // constructeur sans parametre
    public Client() {

    }

    // constructeur avec paramétres
    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    // les getters et setters
    // id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // prenom
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Compte
    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

}
