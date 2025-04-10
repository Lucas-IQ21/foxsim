import building.Refinery;
import rawMaterials.RawMaterial;
import rawMaterials.TypeRawMaterial;
import refinedMaterials.RefinedMaterial;
import refinedMaterials.TypeRefinedMaterial;

public class Main {
    public static void main(String[] args) {

        RawMaterial salvage = new RawMaterial(1000, 480, TypeRawMaterial.Salvage);
        System.out.println("Le type : " + salvage.getTypeRawMaterial());
        System.out.println("La quantité : " + salvage.getQuantity());

        Refinery refinery = new Refinery();
        System.out.println("La rafinerie est créé : " + refinery.getName());
        refinery.submitRawMatrials(salvage, 100);
        System.out.println("La quantité ajouté dans la raffinerie : " + refinery.getRawQuantitySalvage());
        RefinedMaterial diesel = new RefinedMaterial(refinery.refinement(salvage, TypeRefinedMaterial.Diesel), TypeRefinedMaterial.Diesel);
        System.out.println("Salvage complètement raffiné : " + refinery.getBasicMaterialQuantity());


        System.out.println("Quantité de composants :" + diesel.getQuantity());

    }
}
