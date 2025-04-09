package refinedMaterials;

public class RefinedMaterial {
    private int quantity;
    private TypeRefinedMaterial typeMaterial;


    public RefinedMaterial(int quantity, TypeRefinedMaterial typeMaterial) {
        this.quantity = quantity;
        this.typeMaterial = typeMaterial;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public TypeRefinedMaterial getTypeMaterial() {
        return typeMaterial;
    }

    public void setTypeMaterial(TypeRefinedMaterial typeMaterial) {
        this.typeMaterial = typeMaterial;
    }

}
