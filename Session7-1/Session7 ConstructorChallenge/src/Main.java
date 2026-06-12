public class Main {

  public static void main(String[] args){

    customerInformation customer = new customerInformation(
            "Tim", 1000, "tim@gmail.com"
    );
    System.out.println(customer.getName());
    System.out.println(customer.getCreditLimit());
    System.out.println(customer.getEmail());

    customerInformation secondCustomer = new customerInformation();
    System.out.println(secondCustomer.getName());
    System.out.println(secondCustomer.getCreditLimit());
    System.out.println(secondCustomer.getEmail());

    customerInformation thirdCustomer = new customerInformation("Joe", "joe@email.com");
    System.out.println(thirdCustomer.getName());
    System.out.println(thirdCustomer.getCreditLimit());
    System.out.println(thirdCustomer.getEmail());


  }

}
