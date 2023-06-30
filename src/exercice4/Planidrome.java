/*Écrire une méthode Java qui prend en entrée une chaîne de caractères
et retourne true si la chaîne est un palindrome (c'est-à-dire qu'elle 
se lit de la même manière de gauche à droite et de droite à gauche), et false sinon.*/

package exercice4;

public class Planidrome {
    private String mot;
    
    public String getMot() {
        return mot;
    }
    
    public void setMot(String mot) {
        this.mot = mot;
    }
    
    public boolean estPalindrome() {
        String inverse = "";
        
        
        for (int i = mot.length() - 1; i >= 0; i--) {
            inverse += mot.charAt(i);
        }
        
        return mot.equalsIgnoreCase(inverse);
    }
}
