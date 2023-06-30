package Calculatrice;

public class application {

	public static void main(String[] args) {
		TP tp =new TP ();
		int a=10;
		int b=5;
		int resultatAddition = tp.addition(a, b);
        System.out.println("Addition : " + resultatAddition);
        
        int resultatSoustraction = tp.soustraction(a, b);
        System.out.println("Soustraction : " + resultatSoustraction);
        
        int resultatMultiplication = tp.multiplication(a, b);
        System.out.println("Multiplication : " + resultatMultiplication);
        
        double resultatDivision = tp.division(a, b);
        System.out.println("Division : " + resultatDivision);

	}

}
