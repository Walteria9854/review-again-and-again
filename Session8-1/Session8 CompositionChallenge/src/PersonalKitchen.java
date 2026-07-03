public class PersonalKitchen extends SmartKitchen{
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public PersonalKitchen(String model, String manufactor, Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        super(model, manufactor);
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public void doKitchenWork(){
        coffeeMaker.addWater();
        refrigerator.pourMilk();
        dishWasher.loadDishwasher();
    }
}
