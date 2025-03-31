public class Main {
    public static void main(String[] args) {
        Raffinerie raffinerie = new Raffinerie(10, "Acier");

        raffinerie.ajouterMatiereBrute(500);

        for (int i = 0; i < 50; i++) {
            raffinerie.traiter();
            raffinerie.afficherStock();
            System.out.println("--------------------");
        }
    }
}
