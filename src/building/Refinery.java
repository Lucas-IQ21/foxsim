package building;

import rawMaterials.Salvage;
import rawMaterials.TypeRawMaterial;

public class Refinery extends Building {
    private int rawQuantitySalvage;
    private int basicMaterialQuantity;


    public Refinery() {
        super("Raffinerie", TypeBuilding.Refinery);
    }

    public void submitRawMatrials(Salvage salvage,int quantity) {
        salvage.setQuantity(salvage.getQuantity() + quantity);
        setRawQuantitySalvage(quantity);
    }

    public void refinement(){
        int quantityToRefine = getRawQuantitySalvage();
        
        while (quantityToRefine > 0) {
            System.out.println("Traitement en cours... ("+ quantityToRefine + " unités)");
            try {
                Thread.sleep(480);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            quantityToRefine -= 2;
            System.out.println("Salvage restant :  " + getRawQuantitySalvage());
            
            setBasicMaterialQuantity(+1);
            System.out.println("Bmat créés :  " + getBasicMaterialQuantity());
        }

            System.out.println("Aucune matière a raffiner.");


        
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
