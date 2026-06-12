public class customerInformation {

  private String name;
  private double creditLimit;
  private String email;

  public customerInformation(){
    this("Taro", "sample@gmail.com");
    System.out.println("Empty contructor dedacated. Need to create one automatic");
  }

  public customerInformation(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public customerInformation(String name, String email) {
    this(name, 1000, email);
  }

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}
