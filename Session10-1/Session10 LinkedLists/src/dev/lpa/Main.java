package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {

//    LinkedList<String> placesToVisit = new LinkedList<>();
    var placesToVisit = new LinkedList<String>();

    placesToVisit.add("Sydeny");
    placesToVisit.add(0,"Canberra");
    System.out.println(placesToVisit);

    addMoreElements(placesToVisit);
    System.out.println(placesToVisit);

//    removeELements(placesToVisit);
//    System.out.println(placesToVisit);

    gettingELements(placesToVisit);
    printItinerary3(placesToVisit);

    testIterator(placesToVisit);
  }

  private static void addMoreElements(LinkedList<String> list){
    list.add("Darwin");
    list.add("Hobart");

    list.offer("Melbourne");
    list.offerFirst("Brisbane");
    list.offerLast("Toowoomba");

    list.push("Alice Springs");
  }

  private static void removeELements(LinkedList<String> list){
    list.remove(4);
    list.remove("Brisbane");

    System.out.println(list);
    String s1 = list.remove();
    System.out.println(s1 + " was removed");

    String s2 = list.removeFirst();
    System.out.println(s2 + " was removed");

    String s3 = list.removeLast();
    System.out.println(s3 + " was removed");

    list.push("Sydney");
    list.push("Brisbane");
    list.push("Canberra");
    System.out.println(list);

    String p4 = list.pop();
    System.out.println(p4 + " was removed");
  }

  private static void gettingELements(LinkedList<String> list){

    System.out.println("Retrieved Element = " + list.get(4));

    System.out.println("First Element = " + list.getFirst());
    System.out.println("Last Element = " + list.getLast());
    System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
    System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

    System.out.println("Element from element() = " + list.element());

    System.out.println("Element from peek() = " + list.peek());
    System.out.println("Element from peekFirst() = " + list.peekFirst());
    System.out.println("Element from peekLast() = " + list.peekLast());
  }

  public static void printItinerary(LinkedList<String> list){

    System.out.println("Trip starts ar " + list.getFirst());
    for(int i = 1; i < list.size(); i++){
      System.out.println(" --> From: " + list.get(i - 1) + " to " + list.get(i));
    }
    System.out.println("trip ends at " + list.getLast());
  }
  public static void printItinerary2(LinkedList<String> list){

    System.out.println("Trip starts at " + list.getFirst());
    String perviousTown = list.getFirst();
    for(String town : list){
      System.out.println(" --> From: " + perviousTown + " to " + town);
      perviousTown = town;
    }

    System.out.println("trip ends at " + list.getLast());
  }
  public static void printItinerary3(LinkedList<String> list){

    System.out.println("Trip starts at " + list.getFirst());
    String perviousTown = list.getFirst();
    ListIterator<String> iterator = list.listIterator(1);
    while(iterator.hasNext()){
      var town = iterator.next();
      System.out.println("--> From: " + perviousTown + " to " + town);
      perviousTown = town;
    }
    for(String town : list){
      System.out.println(" --> From: " + perviousTown + " to " + town);
      perviousTown = town;
    }

    System.out.println("trip ends at " + list.getLast());
  }

  private static void testIterator(LinkedList<String> list){
    var iterator = list.listIterator();
    while(iterator.hasNext()){
//      System.out.println(iterator.next());
      if(iterator.next().equals("Brisbane")){
        iterator.add("Lake Wivenhoe");
      }
    }

    while(iterator.hasPrevious()){
      System.out.println(iterator.previous());
    }

    System.out.println(list);

    var iterator2 = list.listIterator(3);
    System.out.println(iterator2.previous());

  }


}
