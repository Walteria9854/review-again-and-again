public class Main {

  public static void main(String[] args) {

    Meals testMeal = new Meals("Cheese Burger", "Small Orange juice", "Fries");
    finalOrder(testMeal);

    Meals testMeal2 = new Meals("Cheese Burger");
    finalOrder(testMeal2);

    Drink testMeal3 = new Drink("Cheese Burger", "Orange Juice", "SMALL", 100);
    finalOrder(testMeal3);
  }



  public static void finalOrder(Meals meals){
    meals.getHamburger();
    meals.createOrder();


  }




}
