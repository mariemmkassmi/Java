/*�crire une m�thode Java qui prend en entr�e une cha�ne de caract�res
et retourne true si la cha�ne est un palindrome (c'est-�-dire qu'elle 
se lit de la m�me mani�re de gauche � droite et de droite � gauche), et false sinon.*/

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
