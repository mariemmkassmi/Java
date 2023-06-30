package exercice3;

public class application {


    public static void main(String[] args) {
        int[] tableau = {1, 2, 5, 10, 5};
        Max m = new Max(tableau);
        
        int maxTab = m.trouverMax();
        System.out.println("Le plus grand nombre du tableau est : " + maxTab);
    }
}