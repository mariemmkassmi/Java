package exercice2;

public class Tableau {
    private int[] tableau;
    public Tableau(int[] tableau) {
        this.tableau = tableau;
    }
    public int calculerSomme() {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }
}
