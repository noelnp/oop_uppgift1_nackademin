public enum LiquidType {
    PROTEIN_DRINK("Protein"),
    TAP_WATER("Kranvatten"),
    MINERAL_WATER("Mineralvatten");

    private final String description;

    LiquidType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
