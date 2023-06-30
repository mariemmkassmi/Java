package exercice4;

public class application {

	public static void main(String[] args) {
		 Planidrome p = new  Planidrome();
	        p.setMot("caca");
	        
	        boolean estPalindrome = p.estPalindrome();
	        
	        if (estPalindrome) {
	            System.out.println("Le mot est un palindrome.");
	        } else {
	            System.out.println("Le mot n'est pas un palindrome.");
	        }
	    }

}
