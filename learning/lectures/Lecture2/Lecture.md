# COMP2000: Software Engineering 2 - Introduction to Java

## Outline

1. Introduction to Java
2. Java Program Structure
3. Object-Oriented Programming Concepts
4. Java Modifiers and Data Types
5. Loops and Conditions in Java
6. Exception Handling
7. File I/O and Wrapper Classes

## 1. Introduction to Java

### Key Points:

- Java is a "very popular" programming language
- Runs on a "virtual machine" (JVM)
- More complex than some languages (e.g., Python)
- Simpler than others (e.g., C++)

### Java Compilation Process:

1. Source Code (.java) → Compiler (javac) → Byte Code (.class)
2. Byte Code → Java Interpreter → Machine Code

### Java Development Kit (JDK):

- Provides environment to develop and execute Java programs
- Includes:
  - Development Tools
  - Java Runtime Environment (JRE)
  - Java Virtual Machine (JVM)

## 2. Java Program Structure

### Basic Structure:

```java
class ClassName {
    public static void main(String[] arguments) {
        // Program execution begins here
        // STATEMENTS
    }
}
```

### Key Components:

- `public`: Method can be accessed from outside the class
- `static`: Method belongs to the class itself
- `void`: Method does not return any value
- `main`: Starting point of the program

### Output:

- Use `System.out.println(some String)` to output to the console

## 3. Object-Oriented Programming Concepts

### Class:

- Template/blueprint describing behavior/state of objects

### Object:

- Instance of a class
- Has states (attributes) and behaviors (methods)

### Methods:

- Behaviors of a class
- Where logic is written and actions are executed

### Instance Variables:

- Unique set of variables for each object
- Represent the object's state

## 4. Java Modifiers and Data Types

### Access Modifiers:

- default: Visible to the package
- public: Visible to the world
- private: Visible to the class only
- protected: Visible to the package and all subclasses

### Non-Access Modifiers:

- static: For creating class methods and variables
- final: For finalizing implementations
- abstract: For creating abstract classes and methods
- synchronized and volatile: Used in multithreading

### Data Types:

1. Primitive Types:

   - byte, short, int, long
   - float, double
   - char
   - boolean
2. Non-primitive Types:

   - String
   - Arrays
   - Classes
   - Interfaces

### Type Conversion:

- Implicit conversion: Automatic (e.g., int to double)
- Explicit conversion: Using casting (e.g., (int)18.7)

## 5. Loops and Conditions in Java

### Loops:

1. while loop:

   ```java
   while (condition) {
       // code block
   }
   ```
2. for loop:

   ```java
   for (initialization; condition; increment/decrement) {
       // code block
   }
   ```
3. do...while loop:

   ```java
   do {
       // code block
   } while (condition);
   ```
4. Enhanced for loop (for-each):

   ```java
   for (declaration : expression) {
       // code block
   }
   ```

### Control Statements:

- break: Terminates the loop or switch statement
- continue: Skips the remainder of the loop body and retests the condition

### Decision Making:

1. if statement:

   ```java
   if (condition) {
       // code block
   }
   ```
2. if...else statement:

   ```java
   if (condition) {
       // code block
   } else {
       // code block
   }
   ```
3. nested-if statement: if or else if statements inside other if or else if statements
4. switch statement: Tests a variable for equality against a list of values

## 6. Exception Handling

### Try-Catch Block:

```java
try {
    // Protected code
} catch (ExceptionName e) {
    // Catch block
}
```

### Multiple Catch Blocks:

```java
try {
    // Protected code
} catch (ExceptionType1 e1) {
    // Catch block
} catch (ExceptionType2 e2) {
    // Catch block
}
```

## 7. File I/O and Wrapper Classes

### File I/O:

- Involves reading from and writing to files
- Requires exception handling

### Wrapper Classes:

- Provide a way to use primitive data types as objects
- Examples: Integer, Double, Boolean, Character
- Useful for:
  - Collections (which only work with objects)
  - Utility methods (e.g., parsing strings)

### Wrapper Class Methods:

- parseXxx() methods: Convert strings to primitive types
- valueOf() methods: Return wrapper objects
- xxxValue() methods: Return primitive values

## Conclusion

This lecture provided a comprehensive introduction to Java programming, covering fundamental concepts such as program structure, object-oriented programming, data types, control flow, exception handling, and more advanced topics like file I/O and wrapper classes. Understanding these concepts is crucial for developing robust and efficient Java applications.
