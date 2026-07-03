public class SmartKitchen {

    private String model;
    private String manufactor;

    public SmartKitchen(String model, String manufactor) {
        this.model = model;
        this.manufactor = manufactor;
    }
}

class Refrigerator extends SmartKitchen {

    private double creatingIce;
    private boolean pouringMilk;

    private boolean hasWorkToDo;



    public Refrigerator(String model, String manufactor, double creatingIce, boolean pouringMilk, boolean hasWorkToDo) {
        super(model, manufactor);
        this.creatingIce = creatingIce;
        this.pouringMilk = pouringMilk;
        this.hasWorkToDo = hasWorkToDo;
    }

    public void pourMilk(){
        if(hasWorkToDo){
            creatingIce++;
            System.out.println("How many times = " + creatingIce);
            pouringMilk = true;
            System.out.println("Pouring Milk successfully = finished Order");
        }
    }
}

class DishWasher extends SmartKitchen {

    private boolean loadingDishwasher;

    private boolean hasWorkToDo;

    public DishWasher(String model, String manufactor, boolean loadingDishwasher, boolean hasWorkToDo) {
        super(model, manufactor);
        this.loadingDishwasher = loadingDishwasher;
        this.hasWorkToDo = hasWorkToDo;
    }

    public void loadDishwasher(){
        double settingTime = 60;
        if(hasWorkToDo){
            loadingDishwasher = true;
            System.out.println("DishWasher activated");

            for(int minute = 60; minute >= 0; minute--){
                System.out.println(minute + " minutes remmaining");
            }
            System.out.println("Times up!!!!!!!");
        }
    }
}

class CoffeeMaker extends SmartKitchen {

    private boolean pourWater = false;
    private boolean hasWorkToDo;
    public CoffeeMaker(String model, String manufactor, boolean hasWorkToDo) {
        super(model, manufactor);
        this.hasWorkToDo = hasWorkToDo;
    }


    public void addWater(){
        if(hasWorkToDo){
            pourWater = true;
            System.out.println("Adding water to finish the order");
        }
    }
}


