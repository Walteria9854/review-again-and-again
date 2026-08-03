package dev.lpa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int[] randomNumbers = new int[4];
    readIntegers(randomNumbers);


  }

  public static void readIntegers(int[] usersNumbers){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < usersNumbers.length; i++){
      usersNumbers[i] = scanner.nextInt();
      System.out.println("All of the numbers = " + Arrays.toString(usersNumbers));
    }

    findMin(usersNumbers);

  }

  public static int findMin(int[] sortedNumbers){
    Arrays.copyOf(sortedNumbers, sortedNumbers.length);
    Arrays.sort(sortedNumbers);
    System.out.println("This is the smallest number = " + sortedNumbers[0]);
    return sortedNumbers[0];
  }



}
