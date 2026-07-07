public class Main {

  public static void main(String[] args) {
    Printer printer1 = new Printer(50);
    printer1.addToner(40);
    printer1.printPages();

    Printer printer2 = new Printer(50, 10);
    printer2.addToner(30);
    printer2.printPages();

    Printer printer3 = new Printer(50, 20, true);
    printer3.addToner(40);
    printer3.printPages();


  }

}
