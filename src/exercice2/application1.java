package exercice2;

public class application1 {

	public static void main(String[] args) {
		Telephone telephone =new Telephone();
		telephone.setCouleur("red");
		telephone.setLargeur(2);
		telephone.setLongeur(1);
		telephone.setMarque("iphone");
		System.out.println(telephone.getCouleur());
		System.out.println(telephone.getMarque());
		System.out.println(telephone.getLargeur());
		System.out.println(telephone.getLongeur());
		Marque marque=new Marque ("marque", "couleur", true);
		marque.setIsAvailableInTunisia(true);
		System.out.println(marque.getIsAvailableInTunisia());
	}

}
