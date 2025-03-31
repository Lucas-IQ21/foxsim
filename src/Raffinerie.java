public class Raffinerie {
    private int capaciteTraitement;
    private MatiereBrute stockBrut;
    private MatiereRaffinee stockRaffine;

    public Raffinerie(int capacite, String type) {
        this.capaciteTraitement = capacite;
        this.stockBrut = new MatiereBrute(type, 0);
        this.stockRaffine = new MatiereRaffinee(type, 0);
    }

    public void ajouterMatiereBrute(int quantite) {
        stockBrut.setQuantite(stockBrut.getQuantite() + quantite);
    }

    public void traiter() {
        int quantiteATraiter = Math.min(stockBrut.getQuantite(), capaciteTraitement);

        if (quantiteATraiter > 0) {
            System.out.println("Traitement en cours... (" + quantiteATraiter + " unités)");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            stockBrut.setQuantite(stockBrut.getQuantite() - quantiteATraiter);
            stockRaffine.ajouterQuantite(quantiteATraiter);

            System.out.println("Traitement terminé : " + quantiteATraiter + " unités transformées.");
        } else {
            System.out.println("Aucune matière à raffiner.");
        }
    }


    public void afficherStock() {
        System.out.println("Stock brut: " + stockBrut.getQuantite());
        System.out.println("Stock raffiné: " + stockRaffine.getQuantite());
    }
}
