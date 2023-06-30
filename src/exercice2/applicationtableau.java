package exercice2;

public class applicationtableau {
	  public static void main(String[] args) {
	        int[] tableau = {1, 2, 5, 10, 5};
	        Tableau t = new Tableau(tableau);
	        int somme = t.calculerSomme();
	        System.out.println("La somme du tableau est : " + somme);
	    }
}
