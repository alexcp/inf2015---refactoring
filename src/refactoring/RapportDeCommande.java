package refactoring;
import java.util.ArrayList;

public class RapportDeCommande {
    public Intervalle intervalle;
    public Commande[] commandes;

    public RapportDeCommande(int date_debut,int date_fin,Commande[] commandes){
        this.intervalle = new Intervalle(date_debut,date_fin);
        this.commandes = commandes;
    }

    public int totalDesVentesDansIntervalleDeTemps(){
        return totalDesVentes(commandesDansIntervalleDeTemps());
    }

    private int totalDesVentes(Commande[] commandes) {
        int somme = 0;

        for(Commande commande : commandes){
            somme += commande.montant;
        }
        return somme;
    }

    private Commande[] commandesDansIntervalleDeTemps() {
        ArrayList<Commande> commandesDansIntervalleDeTemps = new ArrayList<Commande>();
        for(Commande commande : commandes){
            if(commande.estDansIntervalle(intervalle)){
                commandesDansIntervalleDeTemps.add(commande);
            }
        }
        return (Commande[])commandesDansIntervalleDeTemps.toArray();
    }
}