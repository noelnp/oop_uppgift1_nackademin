public class Cactus extends Plant {

    public Cactus(double height, String name, LiquidType liquidType) {
        super(height, name, liquidType);
    }

    @Override
    public double getLiquidAmount() {
        return 0.02;
    }
}
