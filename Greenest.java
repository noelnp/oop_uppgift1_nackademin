import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Greenest {

    List<Plant> plants = new ArrayList<>();


    public void checkIn(Plant plant) {
        plants.add(plant);
    }

    public void feedPlant() {

        var scanner = new Scanner(System.in);
        System.out.print("Vilken växt ska få vätska? ");

        while (true) {
            boolean plantFound = false;

            String plantNameInput = scanner.nextLine();
            if (plantNameInput.isBlank()) {
                System.out.println("Fältet får inte vara tomt, försök igen.");
            }

            for (Plant plant : plants) {
                if (plant.getName().equalsIgnoreCase(plantNameInput)) {
                    System.out.println("Antal liter: " + plant.getLiquidAmount() + " "
                            + "Typ av vätska: " + plant.getLiquidType().getDescription());
                    plantFound = true;
                }
            }

            if (plantFound) {
                break;
            } else {
                System.out.println("Växten du angav finns inte incheckad, försök igen.");
            }
        }


    }
}
