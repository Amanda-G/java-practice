package com.example.javaPractice.loops;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {

  private String fistName;

  public List<Person> getPersonList() {
    return getPeople();
  }

  public Person[] getPersonArray() {
    List<Person> personList = getPeople();
    return personList.toArray(Person[]::new);
  }

  private List<Person> getPeople() {
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
}
