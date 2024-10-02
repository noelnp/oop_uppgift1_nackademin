public class CarnivorousPlant extends  Plant {
    public CarnivorousPlant(double height, String name, LiquidType liquidType) {
        super(height, name, liquidType);
    }

    @Override
    public double getLiquidAmount() {
        return 0.1 + (0.2 * this.getHeight());
    }
}
