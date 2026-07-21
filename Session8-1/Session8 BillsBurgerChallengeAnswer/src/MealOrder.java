public class MealOrder {

  private Burger burger;
  private Item drink;
  private Item side;

  public MealOrder(String burgerTyoe, String drinkType, String sideType){
    this.burger = new Burger(burgerTyoe,4.0);
    this.drink = new Item("drink",drinkType, 1.00);
    this.side = new Item("side", sideType, 1.50);
  }



}
