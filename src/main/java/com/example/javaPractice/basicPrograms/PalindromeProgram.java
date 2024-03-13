package com.example.javaPractice.basicPrograms;

import java.io.CharArrayWriter;

public class PalindromeProgram {

  public static void main(String[] args) {
    PalindromeProgram p = new PalindromeProgram();
    p.isPalindromeWithCharArray("RaceCar");
    p.isPalindromeWithCharArray("Flower");
    p.isPalindromeWithCharArray("Never a foot too far even");
    PalindromeProgram p2 = new PalindromeProgram();
    p2.isPalindromeWithStringBuilder("RaceCar");
    p2.isPalindromeWithStringBuilder("Flower");
    p2.isPalindromeWithStringBuilder("Never a foot too far even");
  }

  public void isPalindromeWithCharArray(String original) {
    String replace = original.replace(" ", "");
    char[] originalArray = replace.toCharArray();
    CharArrayWriter reverseArray = new CharArrayWriter();
    for (int i = originalArray.length - 1; i >= 0; i--) {
      reverseArray.append(originalArray[i]);
    }
    String reverse = reverseArray.toString();
    System.out.println(reverse);
    System.out.println(original);
    if (reverse.equalsIgnoreCase(replace)) {
      System.out.println(original + " is a palindrome");
    } else {
      System.out.println(original + " is not a palindrome");
    }
  }

  public void isPalindromeWithStringBuilder(String original) {
    String replace = original.replace(" ", "");
    StringBuilder reverseString = new StringBuilder(replace);
    reverseString.reverse();
    if (reverseString.toString().equalsIgnoreCase(replace)) {
      System.out.println(original + " is a palindrome");
    } else {
      System.out.println(original + " is not a palindrome");
    }
  }
}