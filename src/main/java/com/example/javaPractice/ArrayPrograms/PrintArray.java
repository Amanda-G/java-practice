package com.example.javaPractice.ArrayPrograms;

public class PrintArray {

  public static void main(String[] args) {
    PrintArray pa = new PrintArray();
    pa.printArrayValues();
    pa.printArrayValuesReverse();
  }

  public void printArrayValues(){
    int[] values = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    System.out.println("Array values");
    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }
  }

  public void printArrayValuesReverse(){
    int[] values = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    System.out.println("Array values reverse");
    for (int i = values.length-1; i >= 0; i--){
      System.out.println(values[i]);
    }
  }

}
