package building;

abstract class Building {
    private String name;
    private TypeBuilding type;

    public Building(String name, TypeBuilding type) {
        this.name = name;
        this.type = type;
    }
    public TypeBuilding getType() {
        return type;
    }
    public String getName() {
        return name;
    }

}
