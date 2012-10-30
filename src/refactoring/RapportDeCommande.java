package refactoring;
import java.util.ArrayList;

public class RapportDeCommande {
    public int date_debut;
    public int date_fin;
    public Commande[] commandes;

    public RapportDeCommande(int date_debut,int date_fin,Commande[] commandes){
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.commandes = commandes;
    }

    public int totalDesVentesDansLIntervalDeTemps(){
        int somme = 0;
        ArrayList<Commande> commandesDansLIntervalDeTemps = new ArrayList<Commande>();

        for(Commande commande : commandes){
            if(commande.date >= date_debut && commande.date <= date_fin){
                commandesDansLIntervalDeTemps.add(commande);
            }
        }

        for(Commande commande : commandesDansLIntervalDeTemps){
            somme += commande.montant;
        }
        return somme;
    }
}
