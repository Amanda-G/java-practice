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
### WHILE LOOP
  - Iterates through a block of code repeatedly until a boolean condition becomes false.

    - Example:
    ```java
    int i = 0;
    while (i < person.getPersonList().size()) {
    System.out.println(person.getPersonList().get(i).getFistName());
    i++;
    }
    ```

## DO WHILE LOOP
- Iterates through a block of code while a boolean condition is true. Use this when you need to iterate through code at least once.

    - Example:
    ```java
    int i = 0;
    do {
    System.out.println(person.getPersonList().get(i).getFistName());
    i++;
    } while (i < person.getPersonList().size());(i < person.getPersonList().size());
     ```

# BASIC PROGRAMS

## PALINDROME PROGRAM
- Determines if a string is the same forwards and backwards.

  - For loop Example:
    
    [For Loop](src/main/java/com/example/javaPractice/basicPrograms/Palindrome.java)
    - Line 19

  - StringBuilder Example:
      
    [StringBuilder](src/main/java/com/example/javaPractice/basicPrograms/Palindrome.java)
    - Line 36


## PRIME NUMBER PROGRAM

- Determines if a number is prime.

  - Example:
        
    [Is Prime Number](src/main/java/com/example/javaPractice/basicPrograms/PrimeNumber.java)

## FACTORIAL PROGRAM

- Find the factorial of any number

  - Example with Loop:

    [Find Factorial Using Loop](src/main/java/com/example/javaPractice/basicPrograms/FactorialProgram.java)
    - **Line 13**

  - Example with Recursion:

    - Recursion: process in which a method calls itself continuously (usually until some condition is met)
    
      [Find Factorial Using Recursion](src/main/java/com/example/javaPractice/basicPrograms/FactorialProgram.java)
    - **Line 21**

# ARRAY PROGRAMS

## PRINT ARRAY
- Printing Array values forwards and reverse

    [Printing Array Values](src/main/java/com/example/javaPractice/ArrayPrograms/PrintArray.java)

## PRINT DUPLICATES
- Print duplicate Values in an array
        
    [Print Duplicate Values](src/main/java/com/example/javaPractice/ArrayPrograms/PrintDuplicates.java)

## SORT ARRAY
- Sorting Array Values ascending and descending
        
    [Sort Array Values](src/main/java/com/example/javaPractice/ArrayPrograms/SortArray.java)
