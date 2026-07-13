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

    protected void runEngine(){

    }

    public static Car getCarType(String description){
        return switch(description.toUpperCase().charAt(0)){
            case 'A' -> new GasPoweredCar(description);
            case 'E'-> new ElectricCar(description);
            default -> new Car(description);
        };
    }


}

