package refactoring;

public class Intervalle {
    public int debut;
    public int fin;

    public Intervalle(int debut, int fin){
        this.debut = debut;
        this.fin = fin;
    }

    public boolean estPresent(int element){
        return element >= debut && element <= fin;
    }
}
