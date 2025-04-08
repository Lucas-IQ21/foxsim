package refinedMaterials;

public enum TypeRefinedMaterial {
    AluminumAlloy("Alluminium Alloy", 1, 24),
    Gravel("Gravel", 5, 1),
    RefinedMaterials("Refined Materials", 20, 400),
    CopperAlloy("Copper Alloy", 1, 24),
    IronAlloy("Iron Alloy", 1, 24),
    BasicMaterials("Basic Materials",2, 4800),
    ExplosivePowder("Explosive Powder", 1, 900),
    Diesel("Diesel", 10, 12000),
    HeavyExplosivePowder("Heavy Explosive Powder",5, 1500);

    private final String label;
    private final int ratio;
    private final int timeToRefine;


    private TypeRefinedMaterial(String label, int ratio, int timeToRefine) {
        this.ratio = ratio;
        this.label = label;
        this.timeToRefine = timeToRefine;
    }

    public int getRatio() {
        return ratio;
    }

    public String getLabel() {
        return label;
    }

    public int getTimeToRefine() {
        return timeToRefine;
    }

}

