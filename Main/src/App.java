import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Créer un Client:
        Client client1 = new Client(1, "Ayyoub", "Ait Abdeslam");
        // créer un Compte:
        Compte compte1 = new Compte(1, "A2425517", client1);
        // l'association de compte1 à client1
        client1.setCompte(compte1);
        // créer des operations en l'association à compte1
        Operation operation1 = new Operation(new Date(2024, 1, 22), "VERS", 1500.00, compte1);
        compte1.addOperation(operation1);
        Operation operation2 = new Operation(new Date(2024, 1, 24), "VERS", 5550.00, compte1);
        compte1.addOperation(operation2);
        Operation operation3 = new Operation(new Date(2024, 1, 28), "RETIRER", 1000.00, compte1);
        compte1.addOperation(operation3);
        Operation operation4 = new Operation(new Date(2024, 2, 8), "VERS", 2500.00, compte1);
        compte1.addOperation(operation4);
        Operation operation5 = new Operation(new Date(2024, 2, 23), "RETIRER", 1000.00, compte1);
        compte1.addOperation(operation5);

        // l'affichage
        System.out.println("------------------------------------------------------");
        System.out.println("Client: " + client1.getNom() + " " + client1.getPrenom());
        System.out.println("Compte N: " + compte1.getNumero());
        System.out.println("\nLes opérations du Compte : ");
        System.out.println("_la date_\t\t_le type_\t_le montant_");

        // change la forme de la date :
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (Operation op : compte1.getOperations()) {
            System.out.println(dateFormat.format(op.getDate()) + "\t\t" + op.getType() + "\t\t" + op.getMontant());
        }
        System.out.println("\n\t\t\t\tSolde : " + compte1.getSolde());
        System.out.println("------------------------------------------------------");

    }
}
