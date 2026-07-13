public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
        this.avgKmPerLitre = 60;
        this.cylinders = 8;
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("WWWWOOOOOOOOOOMMMMMMMMMMMM");

    }

    @Override
    public void drive() {
        super.drive();
        if (avgKmPerLitre > 50 && cylinders >= 4) {
            System.out.println("SPIN SPIN WITH THE WHEELS AND BECOME FAST AND FURIOUS");
        }

    }
}
