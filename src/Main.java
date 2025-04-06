import building.Refinery;
import rawMaterials.Salvage;


public class Main {
    public static void main(String[] args) {


        Salvage salvage = new Salvage(100);
        System.out.println("Le type : " + salvage.getType());
        System.out.println("La quantité : " + salvage.getQuantity());

        Refinery refinery = new Refinery();
        System.out.println("La rafinerie est créé : " + refinery.getName());
        refinery.submitRawMatrials(salvage, 12000);
        System.out.println("La quantité ajouté dans la raffinerie : " + refinery.getRawQuantitySalvage());
        refinery.refinement();
    }
}
