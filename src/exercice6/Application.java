package exercice6;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		int[] tableau = {2, 5, 10, 5, 16, 17};
		int[] nombresPremiers = Exercice.filtrerNombresPremiers(tableau);

        System.out.println("Tableau d'origine : " + Arrays.toString(tableau));
        System.out.println("Nombres premiers : " + Arrays.toString(nombresPremiers));
    }
}
