public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterSize;

    public ElectricCar(String description) {
        super(description);
        this.avgKmPerCharge = 60;
        this.batterSize = 100;
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterSize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterSize = batterSize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        if(batterSize <= 0){
            System.out.println("Out of battery, please charge");
        }
        System.out.println("Electric mode is starting,,,,, loading");
    }

    @Override
    public void drive() {
        super.drive();
        if (avgKmPerCharge > 50) {
            System.out.println("over speeding. Please adjust the speed");
        }

        if(batterSize <= 30){
            System.out.println("Lower Battery. Please charge");
        }

    }
}
