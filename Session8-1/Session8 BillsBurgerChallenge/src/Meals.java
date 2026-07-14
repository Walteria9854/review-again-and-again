public class Meals {

  private String hamburger;
  private String drink;
  private String sideItem;

  public Meals(String hamburger, String drink, String sideItem) {
    this.hamburger = "Burger";
    this.drink = "Small Coke";
    this.sideItem = "small Fries";
  }


}

class Side extends Meals{
  private String type;
  private String size;
  private int price;

  public Side(){}
}
