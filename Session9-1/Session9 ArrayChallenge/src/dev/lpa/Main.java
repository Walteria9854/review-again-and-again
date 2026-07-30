package dev.lpa;

import java.util.Arrays;
import java.util.Random;


public class Main {

  public static void main(String[] args) {

    int[] firstArray = getRandomArray(5);
    System.out.println("Before sorting : " + Arrays.toString(firstArray));
    Arrays.sort(firstArray);
    System.out.println("Down to up list : " +Arrays.toString(firstArray));
//    Arrays.sort(firstArray, Collections.reverseOrder());
//    System.out.println("Up to Down List : " + Arrays.toString(firstArray));

    int[] sortedArray = sortIntegers(new int[] {7, 30, 35});
    System.out.println(Arrays.toString(sortedArray));

  }

  public static int[] getRandomArray(int numbers){
    Random random = new Random();
    int[] intNumbers = new int[numbers];
    for(int i = 0; i < numbers; i++){
      intNumbers[i] = random.nextInt(1000);
    }
    return intNumbers;
  }

  private static int[] sortIntegers(int[] array) {
    System.out.println(Arrays.toString(array));
    int[] sortedArray = Arrays.copyOf(array, array.length);
    boolean flag = true;
    int temp;
    while (flag) {
      flag = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
          System.out.println("------->" + Arrays.toString(sortedArray));
        }
      }
      System.out.println("---------> " + Arrays.toString(sortedArray));
    }
    return sortedArray;
  }

}
