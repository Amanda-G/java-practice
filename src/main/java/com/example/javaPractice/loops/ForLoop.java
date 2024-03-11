package com.example.javaPractice.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ForLoop {

  public static void main(String[] args) {
    ForLoop loop = new ForLoop();
    loop.traditionalForLoop();
    loop.forEachLoop();
    loop.forLoopWithoutIndex();
    loop.traditionalForLoopWithArray();
    loop.forEachLoopWithArray();
    loop.forLoopWithoutIndexArray();
  }
  Person person = new Person();
  public void traditionalForLoop() {
    System.out.println("ForLoop List:");
    for (int i = 0; i < person.getPersonList().size(); i++) {
      System.out.println(person.getPersonList().get(i).getFistName() + " - " + i);
    }
  }

  public void traditionalForLoopWithArray() {
    System.out.println("ForLoop Array: ");
    for (int i = 0; i < person.getPersonArray().length; i++) {
      System.out.println(person.getPersonArray()[i].getFistName() + " - " + i);
    }
  }
  public void forEachLoop() {
    System.out.println("ForEach Loop: ");
    person.getPersonList().forEach(person -> {
      System.out.println(person.getFistName());
    });
  }

  public void forEachLoopWithArray() {
    System.out.println("ForEach Loop Array:");

  Stream<Person> personStream = Stream.of(person.getPersonArray());

  personStream.forEach(person -> {System.out.println(person.getFistName());});
  }

  public void forLoopWithoutIndex() {
    System.out.println("ForLoop List w/o index:");
    for (Person person : person.getPersonList()) {
      System.out.println(person.getFistName());
    }
  }

  public void forLoopWithoutIndexArray() {
    System.out.println("ForLoop Array w/o index:");
    for (Person person : person.getPersonArray()) {
      System.out.println(person.getFistName());
    }
  }

}



/*
 * List vs Array or List vs ArrayList;
 *
 *
 * */