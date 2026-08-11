package deb.lpa;

import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String scannerInformation = scanner.nextLine();


    System.out.println("""
        Avaiable actions( select word or letter):
        (F)orward
        (B)ackward
        (L)ist Places
        (M)enu
        (Q)uit
        """);
    System.out.println(scannerInformation);

    switch(scannerInformation){
      case "F" ->forwardList();
    }

  }

  private static void forwardList(){}

  private static void listPlaces(){
    Scanner scanner = new Scanner(System.in);
    List<String> location =
  }

}
