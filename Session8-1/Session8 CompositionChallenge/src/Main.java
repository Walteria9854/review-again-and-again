public class Main {

    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator("22202", "LG", 0, true, true);

        DishWasher dishWasher = new DishWasher("22202", "LG", true, true);

        CoffeeMaker coffeeMaker = new CoffeeMaker("22202", "LG", true);

        PersonalKitchen personalKitchen = new PersonalKitchen("22202", "LG", refrigerator, dishWasher, coffeeMaker);

        personalKitchen.doKitchenWork();

    }
}
