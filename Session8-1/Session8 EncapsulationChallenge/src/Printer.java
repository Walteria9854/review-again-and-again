public class Printer {

  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;

  public Printer(int tonerLevel) {
    this(tonerLevel, 1, false);
  }

  public Printer(int tonerLevel, int pagesPrinted) {
    this(tonerLevel, pagesPrinted, false);
  }

  public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
    this.tonerLevel = tonerLevel;
    this.pagesPrinted = pagesPrinted;
    this.duplex = duplex;
  }



  public void addToner(int addtionalToner){
    tonerLevel = tonerLevel + addtionalToner;
    int maxToner = 100;
    if(tonerLevel > maxToner){
      System.out.println("Toner is too much. Please adjust the toner");
      tonerLevel = 100;
    }else if(tonerLevel <= 0){
      System.out.println("Please refill the toner");
      tonerLevel = -1;
    }else {
      System.out.println("Success adjusting toner at " + tonerLevel);
    }
  }

  public void printPages(){
    if(pagesPrinted > 1 && duplex){
      System.out.println("Will printed front and back");
      for(int i = 0; i < pagesPrinted;) {
        System.out.println("...Printing");
        i++;
        i++;
        if(i == pagesPrinted){
          System.out.println("Stopped");
          System.out.println("Total page is " + pagesPrinted);
        }
      }
    }else{
      System.out.println("Only print the front side ");
      System.out.println("Total page is " + pagesPrinted);
    }

  }




}
