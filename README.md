# JAVA CONCEPTS

## ANNOTATIONS

- `@Data`: A convenient shortcut annotation that combines `@ToString`, `@EqualsAndHashCode`, `@Getter`, `@Setter`, and `@RequiredArgsConstructor`. Generates all the boilerplate code usually associated with plain old Java objects (POJOs) and beans.
- `@AllArgsConstructor`: Generates a constructor with arguments for all fields.
- `@NoArgsConstructor`: Generates a constructor with no arguments.

## LOOP STATEMENTS

### FOR LOOP

- **Traditional For Loop with Index**
    - Use when an index is needed and/or the size of the array/list is known.
    - List example:
      ```java
      for (int i = 0; i < getPersonList().size(); i++) {
          System.out.println(getPersonList().get(i).getFirstName() + " - " + i);
      }
      ```
    - Array example:
      ```java
      for (int i = 0; i < getPersonArray().length; i++) {
          System.out.println(getPersonArray()[i].getFirstName() + " - " + i);
      }
      ```

- **For Loop without Index**
    - Use when the index is not needed.
    - List example:
      ```java
      for (Person person : getPersonList()) {
          System.out.println(person.getFirstName());
      }
      ```
    - Array example:
      ```java
      for (Person person : getPersonArray()) {
          System.out.println(person.getFirstName());
      }
      ```

- **ForEach Loop**
    - An enhanced For Loop; index not required.
    - List example:
      ```java
      getPersonList().forEach(person -> System.out.println(person.getFirstName()));
      ```
    - Array example:
      ```java
      Stream<Person> personStream = Stream.of(getPersonArray());
      personStream.forEach(person -> System.out.println(person.getFirstName()));
      ```