package deb.lpa;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

record Place(String name, int distance) {
  Place(String name, int distance) {
    this.name = name;
    this.distance = distance;
  }

  public String toString() {
    return String.format("%s (%d)", this.name, this.distance);
  }

  public String name() {
    return this.name;
  }

  public int distance() {
    return this.distance;
  }
}

public class Main {

  public static void main(String[] args) {

    LinkedList<Place> placeToVisit = new LinkedList<>();
    Place placeLocation = new Place("Adelaide", 1374);
    addPlace(placeToVisit, placeLocation);
    addPlace(placeToVisit, new Place("adelaide", 1374));
    addPlace(placeToVisit, new Place("Brisbane", 917));
    addPlace(placeToVisit, new Place("Perth", 3923));
    addPlace(placeToVisit, new Place("Alice Springs", 2771));
    addPlace(placeToVisit, new Place("Darwin", 3972));
    addPlace(placeToVisit, new Place("Melbourne", 877));

    placeToVisit.addFirst(new Place("Sydeny", 0));
    System.out.println(placeToVisit);

    printMenu();

    Scanner scanner = new Scanner(System.in);
    String scannerInformation = scanner.nextLine();

    System.out.println(scannerInformation);

    switch(scannerInformation){
      case "F" ->forwardList();
    }

  }

  private static void printMenu(){
    System.out.println("""
        Available actions (select word or letter):
        (F)orward
        (B)ackwards
        (L)ist Places
        (M)enu
        (Q)uit
        """);
  }

  private static void addPlace(LinkedList<Place> list, Place place){
    if(list.contains(place)){
      System.out.println("Found the duplicate " + place);
    }

    for(Place p : list){
      if(p.name().equalsIgnoreCase(place.name())){
        System.out.println("Found the duplicate "+ place);
      }
    }

    int matchedIndex = 0;
    for(var listPlace : list){
      if(place.distance() < listPlace.distance()){
        list.add(matchedIndex, place);
      }
      matchedIndex++;
    }
    list.add(place);
  }

  private static void forwardList(){}

  private static void listPlaces(){
    Scanner scanner = new Scanner(System.in);
  }

}
