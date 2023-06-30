
/*Écrire une méthode Java qui prend en entrée deux entiers, divise le premier entier par
le deuxième entier et retourne le résultat de la division.*/


package exercice5;

public class Exception {
	public static double division(int a, int b) throws ArithmeticException {
	   if (b == 0) {
           throw new ArithmeticException("Division par zéro impossible");
       }

       return (double) a / b;
   }

}
