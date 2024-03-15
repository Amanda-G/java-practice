package com.example.javaPractice.ArrayPrograms;

public class PrintDuplicates {

  public static void main(String[] args) {
    PrintDuplicates pdup = new PrintDuplicates();
    pdup.printDuplicatesWithForLoop();
  }

  public void printDuplicatesWithForLoop() {

  int[] numArray = new int[]{1, 2, 3, 4, 2, 5, 6, 2, 7, 5, 8, 9, 5};

    System.out.println("Duplicate values in my array ");

  for (int i = 0; i < numArray.length; i++) {
    for (int j = i+1; j < numArray.length; j++) {
      if (numArray[i] == numArray[j]) {
        System.out.println(numArray[i]);
      }

    }
  }
}

}
