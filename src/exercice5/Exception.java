
/*�crire une m�thode Java qui prend en entr�e deux entiers, divise le premier entier par
le deuxi�me entier et retourne le r�sultat de la division.*/


package exercice5;

public class Exception {
	public static double division(int a, int b) throws ArithmeticException {
	   if (b == 0) {
           throw new ArithmeticException("Division par z�ro impossible");
       }

       return (double) a / b;
   }

}
