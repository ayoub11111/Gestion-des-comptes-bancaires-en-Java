import java.util.ArrayList;
import java.util.List;

public class Compte {
    private int id;
    private String numero;
    private double solde;
    // la relation qui contient une seule référance vers un Client
    private Client client;
    // la relation qui contient plusieurs référence vers des Operations
    private List<Operation> operations = new ArrayList<Operation>();

    // constructeur par défaut
    public Compte() {
        this.solde = 0.0;
    }

    /* constructeur avec paramètres */
    public Compte(int i, String n, Client client) {
        this.id = i;
        this.numero = n;
        this.solde = 0;
        this.client = client;
    }

    // les getters et setters
    // id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // numéro
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Solde
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Client
    public Client getClient() {
        return client;
    }

    public void setClient(Client c) {
        this.client = c;
    }

    // get Operations
    public List<Operation> getOperations() {
        return operations;
    }

    // ajouter un nouveaux operation et ou même temps calculer le nouveaux solde
    public void addOperation(Operation o) {
        operations.add(o);
        if (o.getType().equals(Operation.TYPE_VERS)) {
            this.solde += o.getMontant();
        }

        if (o.getType().equals(Operation.TYPE_RETIRER)) {
            double nouveauSolde = this.solde - o.getMontant();
            if (o.getMontant() <= this.solde) {
                this.solde = nouveauSolde;
            } else {
                System.out.println("Erreur de montant, le retrait est supérieur au solde");
            }
        }

    }
}
