package building;

import rawMaterials.Salvage;
import rawMaterials.TypeRawMaterial;

public class Refinery extends Building {
    int rawQuantitySalvage;


    public Refinery() {
        super("Raffinerie", TypeBuilding.Refinery);
    }

    public void submitRawMatrials(Salvage salvage,int quantity) {
        salvage.setQuantity(salvage.getQuantity() + quantity);
        setRawQuantitySalvage(quantity);
    }

    // Get & Set
    public int getRawQuantitySalvage() {
        return rawQuantitySalvage;
    }

    public void setRawQuantitySalvage(int rawQuantitySalvage) {
        this.rawQuantitySalvage += rawQuantitySalvage;
    }


}

//public class Refinery {
//    private int capaciteTraitement;
//    private RawMaterial stockBrut;
//    private RafinedMaterial stockRaffine;
//
//    public Refinery(int capacite, String type) {
//        this.capaciteTraitement = capacite;
//        this.stockBrut = new RawMaterial(type, 0);
//        this.stockRaffine = new RafinedMaterial(type, 0);
//    }
//
//    public void submitRawMatrials(int quantity) {
//        stockBrut.setQuantite(stockBrut.getQuantite() + quantity);
//    }
//
//    public void traiter() {
//        int quantiteATraiter = Math.min(stockBrut.getQuantite(), capaciteTraitement);
//
//        if (quantiteATraiter > 0) {
//            System.out.println("Traitement en cours... (" + quantiteATraiter + " unités)");
//
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            stockBrut.setQuantite(stockBrut.getQuantite() - quantiteATraiter);
//            stockRaffine.ajouterQuantite(quantiteATraiter);
//
//            System.out.println("Traitement terminé : " + quantiteATraiter + " unités transformées.");
//        } else {
//            System.out.println("Aucune matière à raffiner.");
//        }
//    }
//
//
//    public void afficherStock() {
//        System.out.println("Stock brut: " + stockBrut.getQuantite());
//        System.out.println("Stock raffiné: " + stockRaffine.getQuantite());
//    }
//}
