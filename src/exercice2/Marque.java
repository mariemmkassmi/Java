package exercice2;

public class Marque extends Telephone {
    private Boolean isAvailableInTunisia;

    public Marque(String marque, String couleur, Boolean isAvailableInTunisia) {
        super();
        this.isAvailableInTunisia = isAvailableInTunisia;
    }

    public Boolean getIsAvailableInTunisia() {
        return isAvailableInTunisia;
    }

    public void setIsAvailableInTunisia(Boolean isAvailableInTunisia) {
        this.isAvailableInTunisia = isAvailableInTunisia;
    }
}

