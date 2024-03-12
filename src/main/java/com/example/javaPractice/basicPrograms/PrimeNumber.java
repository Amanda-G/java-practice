package com.example.javaPractice.basicPrograms;

public class PrimeNumber {

  public static void main(String[] args) {
    PrimeNumber pr = new PrimeNumber();
    pr.isPrimeStatement(11);
    pr.isPrimeStatement(12);
    pr.isPrimeStatement(15);
    pr.isPrimeStatement(17);

  }

  public Boolean isPrimeNumber(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i < number; i++)
      if (number % i == 0) {
        return false;
      }
      return true;

  }

  public void isPrimeStatement(int number){
    PrimeNumber pr = new PrimeNumber();
    if (pr.isPrimeNumber(number)){
      System.out.println(number + " is prime");
    } else {
      System.out.println(number + " is not prime");
    }
  }
}