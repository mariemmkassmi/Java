package exercice5;

public class Application {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			double resultat=Exception.division(a,b);
			 System.out.println("Le résultat de la division est : " + resultat);
		} catch (ArithmeticException e ) {
			System.out.println(e.getMessage());
		}
		}

	

}
