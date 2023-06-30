package exercice3;

/*Écrire une méthode Java qui prend en entrée un tableau d'entiers
et retourne le plus grand nombre présent dans le tableau.*/
public class Max {
	private int[] tableau;
	 public Max(int[] tableau) {
	        this.tableau = tableau;
	    }
	public int trouverMax() {
		int max = tableau[0];
		for (int i = 1; i < tableau.length; i++) {
			if (tableau[i] > max) {
				max = tableau[i];
			}
		}
		return max;
	}
}