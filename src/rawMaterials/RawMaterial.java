package rawMaterials;

abstract class RawMaterial {
    private String type;
    private int quantity = 0;
    private int timeToRefine;
    private TypeRawMaterial typeRawMaterial;

    public RawMaterial(String type, int quantity, int timeToRefine, TypeRawMaterial typeRawMaterial) {
        this.type = type;
        this.quantity = quantity;
        this.timeToRefine = timeToRefine;
        this.typeRawMaterial = typeRawMaterial;
    }


    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public TypeRawMaterial getTypeRawMaterial() {return typeRawMaterial;}

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
