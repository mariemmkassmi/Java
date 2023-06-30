package exercice8;

public class Application {

    public static void main(String[] args) {
        ListeGenerique<Animal> listeAnimaux = new ListeGenerique<>();
        Animal animal1 = new Animal();
        animal1.setNom("Chien");
        Animal animal2 = new Animal();
        animal2.setNom("Chat");

        listeAnimaux.ajouterElement(animal1);
        listeAnimaux.ajouterElement(animal2);

        System.out.println("Liste des animaux : " + listeAnimaux.getElements());
        System.out.println("Taille de la liste : " + listeAnimaux.taille());
        System.out.println("Élément à l'index 1 : " + listeAnimaux.getElement(1).getNom());
    }

}
