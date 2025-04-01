package rawMaterials;

abstract class RawMaterial {
    private String type;
    private int quantity;
    private int timeToRefine;

    public RawMaterial(String type, int quantity, int timeToRefine) {
        this.type = type;
        this.quantity = quantity;
        this.timeToRefine = timeToRefine;
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

    public void setTimeToRefine(int timeToRefine) {
        this.timeToRefine = timeToRefine;
    }
}
