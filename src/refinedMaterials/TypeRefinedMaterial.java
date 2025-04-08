package refinedMaterials;

public enum TypeRefinedMaterial {
    AluminumAlloy,
    Gravel,
    RefinedMaterials,
    CopperAlloy,
    IronAlloy,
    BasicMaterials,
    ExplosivePowder,
    Diesel,
    HeavyExplosivePowder(10, "toto");
    private final int taux;
    private final String libelle;

    private TypeRefinedMaterial(int taux, String libelle) {
        this.taux = taux;
        this.libelle = libelle;
    }
}
