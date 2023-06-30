package exercice3;

/*�crire une m�thode Java qui prend en entr�e un tableau d'entiers
et retourne le plus grand nombre pr�sent dans le tableau.*/
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