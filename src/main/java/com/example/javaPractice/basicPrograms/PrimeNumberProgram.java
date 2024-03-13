package com.example.javaPractice.basicPrograms;

public class PrimeNumberProgram {

  public static void main(String[] args) {
    PrimeNumberProgram pr = new PrimeNumberProgram();
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
    PrimeNumberProgram pr = new PrimeNumberProgram();
    if (pr.isPrimeNumber(number)){
      System.out.println(number + " is prime");
    } else {
      System.out.println(number + " is not prime");
    }
  }
}