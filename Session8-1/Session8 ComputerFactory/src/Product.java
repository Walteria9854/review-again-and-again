public class Product {

  private String model;
  private String manufacturer;
  private int width;
  private int height;
  private int depth;

  public Product(String model, String manufacturer) {
    this.model = model;
    this.manufacturer = manufacturer;
  }
}

class Montior extends Product {
  public Monitor(String model, String manufactuerer){
    super(model, manufactuerer);
  }
}


class MotherBoard extends Product {
  public MotherBoard(String model, String manufactuerer){
    super(model, manufactuerer);
  }
}


class ComputerCase extends Product {
  public ComputerCase(String model, String manufactuerer){
    super(model, manufactuerer);
  }
}


