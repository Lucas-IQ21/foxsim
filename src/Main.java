import building.Refinery;
import rawMaterials.RawMaterial;
import rawMaterials.TypeRawMaterial;


public class Main {
    public static void main(String[] args) {


        RawMaterial salvage = new RawMaterial(1000, 480, TypeRawMaterial.Salvage);
        System.out.println("Le type : " + salvage.getTypeRawMaterial());
        System.out.println("La quantité : " + salvage.getQuantity());

        Refinery refinery = new Refinery();
        System.out.println("La rafinerie est créé : " + refinery.getName());
        refinery.submitRawMatrials(salvage, 12000);
        System.out.println("La quantité ajouté dans la raffinerie : " + refinery.getRawQuantitySalvage());
        refinery.refinement(salvage);
        System.out.println("Salvage complètement raffiné : "+ refinery.getBasicMaterialQuantity());

        RawMaterial component = new RawMaterial(1000, 40, TypeRawMaterial.Salvage);


    }
}
