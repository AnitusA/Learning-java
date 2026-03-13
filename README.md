# Java Practice Programs

A curated collection of beginner-to-intermediate Java programs built while learning core programming concepts, object-oriented design, collections, file handling, and modern Java syntax.

This repository is structured as a hands-on learning space: each `.java` file focuses on one concept, making it easy to explore topics individually and practice by running small self-contained programs.

## Overview

The programs in this repository cover:

- Java fundamentals and console-based input/output
- Conditional logic, loops, and pattern-based exercises
- Mathematical and string-processing programs
- Object-oriented programming concepts
- Collections, wrappers, enums, and generics
- Exception handling and file operations
- Introductory JDBC and modern Java language features

## Project Structure

This repository contains standalone Java files rather than a single packaged application. Each file can be compiled and executed independently.

### Core Basics

- `hello.java`
- `SimpleCalculator.java`
- `Agechecker.java`
- `Gradeevaluator.java`
- `AreaCalculator.java`
- `BMIcalculator.java`
- `CountdownTimer.java`
- `Ramdomnumber.java`

### Logic, Loops, and Number Programs

- `Factorial.java`
- `Fibonacciseries.java`
- `Multiplicaiontable.java`
- `maxmin.java`
- `palindromechecker.java`
- `reversesentence.java`

### Pattern Printing

- `RightTriangle.java`
- `InvertedRightTriangle.java`

### Object-Oriented Programming

- `Oops.java`
- `Constructor.java`
- `Private.java`
- `Polymorphism.java`
- `Interface.java`
- `Vehicle.java`
- `Shape.java`
- `SimpleRace.java`
- `Config.java`

### Collections and Utility Concepts

- `SimpleGroceryList.java`
- `Stackprogram.java`
- `Listimmutable.java`
- `Wrapper.java`
- `EnumExample.java`
- `Generis.java`

### File Handling and Error Management

- `Writefile.java`
- `Errorhandling.java`
- `WordFrequencyCounter.java`
- `TimeDemo.java`

### Modern Java and Database Basics

- `Modernswitch.java`
- `JDBC.java`

## Highlights

- Clear focus on concept-by-concept learning
- Good variety of examples across syntax, logic, and OOP
- Includes practical programs using files, collections, and JDBC
- Suitable for revision, interview prep, and Java fundamentals practice

## Requirements

To run these programs locally, you will need:

- Java JDK 8 or later
- A terminal or command prompt
- An editor such as VS Code, IntelliJ IDEA, or Eclipse

For `Modernswitch.java`, a newer JDK is recommended because it uses modern switch expressions.

For `JDBC.java`, you will also need:

- MySQL running locally
- A database named `testdb`
- A `users` table with sample data
- The MySQL JDBC driver added to your classpath

## How to Compile and Run

Compile a file:

```bash
javac SimpleCalculator.java
```

Run the compiled class:

```bash
java SimpleCalculator
```

Example workflow:

```bash
javac Factorial.java
java Factorial
```

## Suggested Learning Path

If you are using this repository as a learning resource, a good order is:

1. Start with `hello.java`, `SimpleCalculator.java`, and `Agechecker.java`
2. Move to logic programs like `Factorial.java` and `Fibonacciseries.java`
3. Practice string and pattern exercises
4. Explore OOP concepts through `Oops.java`, `Constructor.java`, and `Polymorphism.java`
5. Continue with collections, enums, wrappers, and generics
6. Finish with file handling, exception handling, and JDBC basics

## Notes

- Most files are independent learning exercises.
- Some class names and filenames reflect practice-stage naming and can be refined over time.
- JDBC examples may require local environment setup before they run successfully.

## Future Improvements

Possible next steps for this repository:

- Organize files into folders by topic
- Standardize naming conventions
- Add package declarations
- Include sample input/output for each program
- Add comments and documentation to each file
- Introduce unit tests for selected logic-based programs

## Author

Created as part of a personal Java learning journey focused on building practical understanding through small, focused programs.
