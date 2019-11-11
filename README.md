# Roman-Numerals 

### Requirements

Java 8 or above, JUnit 5 and Maven (dependency manager)

### About

This project converts a roman numeral to an integer and vice versa with a really simple command-line inteface.
It also contains JUnit tests for testing the algorithms used in the conversions.

### How to run

You can run it from the Eclipse IDE which is the easier way or from the command line with maven.

##### Running from Command line

Since you are not running your code in a maven phase, you first need to compile the code. Remember exec:java does not automatically compile your code, you need to do that first.

> mvn compile

Then run the main class.

> mvn exec:java -Dexec.mainClass="romannumerals.Main"

To run the test class.

> mvn test
