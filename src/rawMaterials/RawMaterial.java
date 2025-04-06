package rawMaterials;

public class RawMaterial {
    private int quantity = 0;
    private int timeToRefine;
    private TypeRawMaterial typeRawMaterial;

    public RawMaterial(int quantity, int timeToRefine, TypeRawMaterial typeRawMaterial) {
        this.quantity = quantity;
        this.timeToRefine = timeToRefine;
        this.typeRawMaterial = typeRawMaterial;
    }

    public int getQuantity() {
        return quantity;
    }

    public TypeRawMaterial getTypeRawMaterial() {return typeRawMaterial;}

    public int getTimeToRefine() {return timeToRefine;}

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTimeToRefine(int timeToRefine) {
        this.timeToRefine = timeToRefine;
    }
    public void setTypeRawMaterial(TypeRawMaterial typeRawMaterial){
        this.typeRawMaterial = typeRawMaterial;
    }
}
