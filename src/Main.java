import building.Refinery;
import rawMaterials.Salvage;


public class Main {
    public static void main(String[] args) {


        Salvage salvage = new Salvage(1500);
        System.out.println("Le type : " + salvage.getType());
        System.out.println("La quantité : " + salvage.getQuantity());

        Refinery refinery = new Refinery();
        System.out.println("La rafinerie est créé : " + refinery.getName());
        refinery.submitRawMatrials(salvage, 1500);
        System.out.println("La quantité ajouté dans la raffinerie : " + refinery.getRawQuantitySalvage());
    }
}
