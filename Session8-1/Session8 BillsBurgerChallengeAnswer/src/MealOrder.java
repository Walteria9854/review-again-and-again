public class MealOrder {

  private Burger burger;
  private Item drink;
  private Item side;

  public MealOrder(){
    this("regular", "Coke", "fries");
  }

  public MealOrder(String burgerTyoe, String drinkType, String sideType){
    this.burger = new Burger(burgerTyoe,4.0);
    this.drink = new Item("drink",drinkType, 1.00);
    this.side = new Item("side", sideType, 1.50);
  }

  public double getTotalPrice(){
    return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
  }

  public void printItemizedList(){
    burger.printItem();
    side.printItem();
    drink.printItem();
    System.out.println("-".repeat(30));
    Item.printItem("TOTAL PRICE", getTotalPrice());
  }

  public void addBurgerTopping(String extra1, String extra2, String extra3){
    burger.addToppings(extra1, extra2, extra3);
  }

  public void setDrinkSIze(String size){
    drink.setSize(size);
  }



}
