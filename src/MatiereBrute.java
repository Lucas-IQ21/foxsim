public class MatiereBrute {
    private String type;
    private int quantite;

    public MatiereBrute(String type, int quantite) {
        this.type = type;
        this.quantite = quantite;
    }

    public String getType() {
        return type;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
