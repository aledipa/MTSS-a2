# Roman Numeral Converter

![Build Status](https://github.com/username/roman-number/actions/workflows/maven.yml/badge.svg)
![Coverage](.github/badges/jacoco.svg)
![Branches](.github/badges/branches.svg)

## Project Description

This project implements a converter for the first 1000 integers from Arabic to Roman numerals. It also includes a feature to print Roman numerals in ASCII art.

## Features

1. Convert integers from 1 to 1000 to Roman numerals
2. Display Roman numerals as ASCII art

## Project Structure

```
roman-number/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── it/
│   │           └── unipd/
│   │               └── mtss/
│   │                   ├── IntegerToRoman.java
│   │                   ├── RomanPrinter.java
│   │                   └── Main.java
│   └── test/
│       └── java/
│           └── it/
│               └── unipd/
│                   └── mtss/
│                       ├── IntegerToRomanTest.java
│                       └── RomanPrinterTest.java
├── .github/
│   └── workflows/
│       └── maven.yml
├── checkstyle.xml
├── pom.xml
└── README.md
```

## Build Instructions

To build the project:
```
mvn clean package
```

To run tests:
```
mvn test
```

To generate checkstyle report:
```
mvn checkstyle:checkstyle
```

To generate JaCoCo coverage report:
```
mvn jacoco:report
```

## Examples

Converting number 4 to Roman numeral:
```java
String roman = IntegerToRoman.convert(4);  // Returns "IV"
```

Printing Roman numeral for number 5 as ASCII art:
```java
String asciiArt = RomanPrinter.print(5);
System.out.println(asciiArt);
```

Output:
```
__ __ 
\ \ / 
 \ /  
  V   
 / \  
/_/\_\
```

## Team Members

- [Malik] [Giafar Mohamed] [2075543]
- [Alessandro] [Di Pasquale] [2075544]
