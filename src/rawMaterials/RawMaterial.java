package rawMaterials;

abstract class RawMaterial {
    private String type;
    private int quantity;

    public RawMaterial(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
