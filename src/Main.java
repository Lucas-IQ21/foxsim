import rawMaterials.Salvage;

public class Main {
    public static void main(String[] args) {


        Salvage s = new Salvage(1500);
        System.out.println("Le type : " + s.getType());
        System.out.println("La quantité : " + s.getQuantity());

//        Refinery refinery = new Refinery(10, "Acier");
//
//        refinery.submitRawMatrials(500);
//
//        for (int i = 0; i < 50; i++) {
//            refinery.traiter();
//            refinery.afficherStock();
//            System.out.println("--------------------");
//        }
    }
}
