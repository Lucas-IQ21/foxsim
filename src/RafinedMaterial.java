public class RafinedMaterial {
    private String type;
    private int quantite;

    public RafinedMaterial(String type, int quantite) {
        this.type = type;
        this.quantite = quantite;
    }

    public String getType() {
        return type;
    }

    public int getQuantite() {
        return quantite;
    }

    public void ajouterQuantite(int quantite) {
        this.quantite += quantite;
    }
}
