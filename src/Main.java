import building.Refinery;
import rawMaterials.Salvage;
import rawMaterials.TypeRawMaterial;

public class Main {
    public static void main(String[] args) {


        Salvage salvage = new Salvage(1500);
        System.out.println("Le type : " + salvage.getType());
        System.out.println("La quantité : " + salvage.getQuantity());

        Refinery refinery = new Refinery();
        System.out.println("La rafinerie est créé : " + refinery.getName());
        refinery.submitRawMatrials(refinery.getRawQuantitySalvage(), TypeRawMaterial.Salvage);
//        refinery.submitRawMatrials(500);
//
//        for (int i = 0; i < 50; i++) {
//            refinery.traiter();
//            refinery.afficherStock();
//            System.out.println("--------------------");
//        }
    }
}
