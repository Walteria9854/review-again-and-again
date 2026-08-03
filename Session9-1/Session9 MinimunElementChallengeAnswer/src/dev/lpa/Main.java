package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int[] returnedArray = readIntegers();
    System.out.println(Arrays.toString(returnedArray));

//    int returnedMin = findMin(returnedArray);
//    System.out.println("min = " + returnedMin);
//
//
//    int[] reverse = reverse(returnedArray);
//    System.out.println("reverse version" + reverse);

//    reverseAnswer(returnedArray);
//    System.out.println("Final: " + Arrays.toString(returnedArray));

    int[] reversedCopy = reverseCopy(returnedArray);
    System.out.println("After reverse " + Arrays.toString(returnedArray));
    System.out.println("reversedCopy" + Arrays.toString(reversedCopy));
  }

  private static int[] readIntegers(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a list of integers, separated by commas: ");
    String input = scanner.nextLine();
    String[] splits = input.split(",");
    int[] values = new int[splits.length];
    for(int i = 0; i < splits.length; i++){
      values[i] =Integer.parseInt(splits[i].trim());
    }
    System.out.println(Arrays.toString(values));
    return values;
  }

  private static int findMin(int[] array){

    int min = Integer.MAX_VALUE;
    for(int el : array){
      if(el < min){
        min = el;
      }
    }
    return min;
  }

  private static int[] reverse(int[] array){
    int maxIndex = array.length - 1;
    int halfNumber = maxIndex / 2;
    int[] arrayNumber = Arrays.copyOf(array, array.length);

    if(arrayNumber.length % 2 == 1){
      int temp;
      for(int i = 0; i < halfNumber; i++){
        temp = arrayNumber[i];
        arrayNumber[i] = arrayNumber[arrayNumber.length - i];
        arrayNumber[arrayNumber.length - i] = temp;
      }
    }else {
      for (int i = halfNumber; i < arrayNumber.length; i++) {
        int temp;
        temp = arrayNumber[i];
        arrayNumber[i] = arrayNumber[arrayNumber.length - i];
        arrayNumber[arrayNumber.length - i] = temp;
      }
    }
    return arrayNumber;
  }

  private static void reverseAnswer(int[] array){
    int maxIndex = array.length - 1;
    int halfLength = array.length / 2;

    for(int i = 0; i < halfLength; i++){
      int temp = array[i];
      array[i] = array[maxIndex - i];
      array[maxIndex - i] = temp;
      System.out.println("-->" + Arrays.toString(array));
    }
  }

  private static int[] reverseCopy(int[] array){
    int[] reversedArray = new int[array.length];
    int maxIndex = array.length - 1;
    for(int el : array){
      reversedArray[maxIndex--] = el;
    }

    return reversedArray;
  }



}
