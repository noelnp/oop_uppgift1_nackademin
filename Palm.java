public class Palm extends Plant {

    public Palm(double height, String name, LiquidType liquidType) {
        super(height, name, liquidType);
    }

    @Override
    public double getLiquidAmount() {
        return 0.5 * this.getHeight();
    }
}