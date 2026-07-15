public class Meals {

  private String hamburger;
  private String drink;
  private String sideItem;

  public Meals(String hamburger){
    this.hamburger = "Burger";
    this.drink = "Small Coke";
    this.sideItem = "small Fries";
  }

  public Meals(String hamburger, String drink, String sideItem) {
    this.hamburger = hamburger;
    this.drink = drink;
    this.sideItem = sideItem;
  }

  public void createOrder(){
    System.out.println("creating order with starting from " + hamburger);
    System.out.println("drink is " + drink);
    System.out.println("sideItem is " + sideItem);
  }


}

class Drink extends Meals{
  private String type;
  private String size;
  private int price;

  public Drink(String hamburger,
      String type, String size, int price) {
    super(hamburger);
    this.type = type;
    this.size =
        switch(size.toUpperCase()){
          case "S" -> "SMALL";
          case "M" -> "MEDIUM";
          case "L" -> "LARGE";
          default -> "Error - non selected";
        };
      if(size.equals("S")){
        price = 100;
      }else if(size.equals("M")){
        price = 120;
      }else if(size.equals("L")){
        price = 150;
      }else {
        price = 0;
      };
  }

  @Override
  public void createOrder() {
    System.out.println("Set Meal with the drinks");
    System.out.println("hamburger will be " + hamburger);
    System.out.println("Drink set will be " + type + "with " + size);
    System.out.println("Drink price will be " + price);

  }
}
