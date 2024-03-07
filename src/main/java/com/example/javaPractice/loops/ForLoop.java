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

  private static List<Person> getPersonList() {
    return getPeople();
  }

  private static Person[] getPersonArray() {
    List<Person> personList = getPeople();
    return personList.toArray(Person[]::new);
  }

  private static List<Person> getPeople() {
    Person person1 = new Person();
    person1.setFistName("Amanda");

    Person person2 = new Person();
    person2.setFistName("Munna");

    Person person3 = new Person();
    person3.setFistName("Maverick");

    List<Person> personList = new ArrayList<>();

    personList.add(person1);
    personList.add(person2);
    personList.add(person3);
    return personList;
  }

  public void traditionalForLoop() {
    System.out.println("ForLoop List:");
    for (int i = 0; i < getPersonList().size(); i++) {
      System.out.println(getPersonList().get(i).getFistName() + " - " + i);
    }
  }

  public void traditionalForLoopWithArray() {
    System.out.println("ForLoop Array: ");
    for (int i = 0; i < getPersonArray().length; i++) {
      System.out.println(getPersonArray()[i].getFistName() + " - " + i);
    }
  }
  public void forEachLoop() {
    System.out.println("ForEach Loop: ");
    getPersonList().forEach(person -> {
      System.out.println(person.getFistName());
    });
  }

  public void forEachLoopWithArray() {
    System.out.println("ForEach Loop Array:");

  Stream<Person> personStream = Stream.of(getPersonArray());

  personStream.forEach(person -> {System.out.println(person.getFistName());});
  }

  public void forLoopWithoutIndex() {
    System.out.println("ForLoop List w/o index:");
    for (Person person : getPersonList()) {
      System.out.println(person.getFistName());
    }
  }

  public void forLoopWithoutIndexArray() {
    System.out.println("ForLoop Array w/o index:");
    for (Person person : getPersonArray()) {
      System.out.println(person.getFistName());
    }
  }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {

  private String fistName;
}



/*
 * List vs Array or List vs ArrayList;
 *
 *
 * */