package refactoring;

public class Commande {
    public int id;
    public int montant;
    public int date;

    public Commande(int id,int montant,int date){
        this.id = id;
        this.montant = montant;
        this.date = date;
    }

    public boolean estDansIntervalle(Intervalle intervalle){
        return intervalle.estPresent(date);
    }
}
