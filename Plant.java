abstract public class Plant implements Feedable {

    private String name;
    private double height;
    private LiquidType liquidType;

    public Plant(double height, String name, LiquidType liquidType) {
        this.height = height;
        this.name = name;
        this.liquidType = liquidType;
    }

    public double getHeight() {
        return height;
    }


    public String getName() {
        return name;
    }

    public LiquidType getLiquidType() {
        return liquidType;
    }

}
