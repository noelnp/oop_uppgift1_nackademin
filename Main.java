//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Greenest greenest = new Greenest();

        Plant olof = new Palm(3, "Olof", LiquidType.TAP_WATER);
        Plant igge = new Cactus(0.2, "Igge", LiquidType.MINERAL_WATER);
        Plant laura = new Palm(5, "Laura", LiquidType.TAP_WATER);
        Plant meatlof = new CarnivorousPlant(0.7, "Meatlof", LiquidType.PROTEIN_DRINK);


        greenest.checkIn(olof);
        greenest.checkIn(igge);
        greenest.checkIn(laura);
        greenest.checkIn(meatlof);

        greenest.feedPlant();

    }
}