public class Main {

    public static void main(String[] args) {

        Car car = Car.getCarType("A");
        car.startEngine();
        car.drive();

        Car tysla = Car.getCarType("E");
        tysla.startEngine();
        tysla.drive();

    }
}
