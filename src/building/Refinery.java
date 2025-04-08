package building;

import rawMaterials.RawMaterial;
import refinedMaterials.TypeRefinedMaterial;

public class Refinery extends Building {
    private int rawQuantitySalvage;
    private int basicMaterialQuantity;


    public Refinery() {
        super("Raffinerie", TypeBuilding.Refinery);
    }

    public void submitRawMatrials(RawMaterial rawMat, int quantity) {
        rawMat.setQuantity(rawMat.getQuantity() + quantity);
        setRawQuantitySalvage(quantity);
    }

    public int refinement(RawMaterial material, TypeRefinedMaterial typeRefinedMaterial) {
        int quantityToRefine = getRawQuantitySalvage();

        while (quantityToRefine >= 2) {
            System.out.println("Traitement en cours... ("+ quantityToRefine + " unités)");
            try {
                Thread.sleep(material.getTimeToRefine());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            quantityToRefine -= typeRefinedMaterial.getRatio();
            System.out.println("Quantités bruts restant :  " + getRawQuantitySalvage());

            setBasicMaterialQuantity(+1);
            System.out.println(typeRefinedMaterial.getLabel()+" créés " + getBasicMaterialQuantity());
        }
            System.out.println("Aucune matière a raffiner.");
        return quantityToRefine;
    }

    // Get & Set
    public int getRawQuantitySalvage() {
        return rawQuantitySalvage;
    }
    public int getBasicMaterialQuantity() {
        return basicMaterialQuantity;
    }

    public void setRawQuantitySalvage(int rawQuantitySalvage) {
        this.rawQuantitySalvage += rawQuantitySalvage;
    }
    public void setBasicMaterialQuantity(int basicMaterialQuantity) {
        this.basicMaterialQuantity += basicMaterialQuantity;
    }
}