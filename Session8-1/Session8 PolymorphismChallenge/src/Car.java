public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){

        System.out.println("Staring the engine");

    }

    public void drive(){
        System.out.println("Drive Drive Drive");
    }

    protected runEngine(){

    }



}

public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

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
        if(avgKmPerLitre > 50 && cylinders >= 4){
            System.out.println("SPIN SPIN WITH THE WHEELS AND BECOME FAST AND FURIOUS");
        }

    }
}
