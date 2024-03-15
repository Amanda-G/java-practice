package com.example.javaPractice.ArrayPrograms;

import java.util.Arrays;

public class SortArray {

  public static void main(String[] args) {
    SortArray sa = new SortArray();
    sa.sortAscending();
    sa.sortDescending();
  }

  public void sortAscending(){
    int[] numArray = new int[] {3,5,6,8,2,9,1,4,7};

    System.out.println("Sorted Ascending: ");
    Arrays.sort(numArray);
    for (int j : numArray) {
      System.out.println(j);
    }
  }

  public void sortDescending(){
    int[] numArray = new int[] {3,5,6,8,2,9,1,4,7};

    System.out.println("Sorted Descending: ");
    Arrays.sort(numArray);
    for (int i = numArray.length-1; i >= 0; i--){
      System.out.println(numArray[i]);
    }
  }
}
