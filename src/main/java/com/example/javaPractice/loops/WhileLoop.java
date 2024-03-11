package com.example.javaPractice.loops;

public class WhileLoop {

  public static void main(String[] args) {
    WhileLoop loop = new WhileLoop();
    loop.whileLoopList();
    loop.whileLoopArray();
    loop.doWhileLoopList();
  }

  Person person = new Person();

  public void whileLoopList() {
    int i = 0;
    System.out.println("While Loop List: ");
    while (i < person.getPersonList().size()) {
      System.out.println(person.getPersonList().get(i).getFistName());
      i++;
    }
  }

  public void whileLoopArray(){
    int i = 0;
    System.out.println("While Loop Array: ");
    while (i < person.getPersonArray().length){
      System.out.println(person.getPersonArray()[i].getFistName());
      i++;
    }
  }

  public void doWhileLoopList(){
    System.out.println("Do while Loop List: ");
    int i = 0;
    do{
      System.out.println(person.getPersonList().get(i).getFistName());
      i++;
    } while(i < person.getPersonList().size());
  }

}
