/*Écrire une méthode Java qui prend en entrée un tableau d'entiers et retourne un nouveau 
 * tableau contenant uniquement les nombres premiers du tableau d'origine.*/


package exercice6;
import java.util.ArrayList;

import java.util.List;
public class Exercice {
	 public static boolean estNombrePremier(int nombre) {
	        if (nombre <= 1) {
	            return false;
	        }

	        for (int i = 2; i < nombre; i++) {
	            if (nombre % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	 public static int[] filtrerNombresPremiers(int[] tableau) {
		  List<Integer> nombresPremiersList = new ArrayList<>();

	        for (int i = 0; i < tableau.length; i++) {
	            if (estNombrePremier(tableau[i])) {
	                nombresPremiersList.add(tableau[i]);
	            }
	        }

	        int[] nombresPremiers = new int[nombresPremiersList.size()];
	        for (int i = 0; i < nombresPremiersList.size(); i++) {
	            nombresPremiers[i] = nombresPremiersList.get(i);
	        }

	        return nombresPremiers;
	    }


	
	
	
}
