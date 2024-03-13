package com.example.javaPractice.basicPrograms;

public class FactorialProgram {

  public static void main(String[] args) {
    FactorialProgram pro = new FactorialProgram();
    pro.factorialWithLoop(5);
    System.out.println(pro.factorialWithRecursion(5));
    System.out.println(pro.factorialWithRecursion(10));
    pro.factorialWithLoop(10);
  }

  public void factorialWithLoop(int number) {
    int fact = 1;
    for (int i = 1; i <= number; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + number + " is " + fact);
  }

  public Integer factorialWithRecursion(int number) {
//    if (number > 1) {
//      return number * factorialWithRecursion(number - 1);
//    }
//    return 1;

    return number > 1 ? number * factorialWithRecursion(number - 1) : 1;
  }

}
