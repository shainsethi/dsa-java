# Conditional Statements in Java

## Table of Contents
- [Introduction](#introduction)
- [if-else Statement](#if-else-statement)
    - [Largest of Two Numbers](#largest-of-two-numbers)
    - [Even or Odd Number](#even-or-odd-number)
- [else-if Statement](#else-if-statement)
    - [Income Tax Calculator](#income-tax-calculator)
    - [Largest of Three Numbers](#largest-of-three-numbers)
- [Ternary Operator](#ternary-operator)
- [Switch Statement](#switch-statement)
    - [Calculator Program](#calculator-program)
- [Practice Questions](#practice-questions)

---

## Introduction
Conditional Statements are used to control the flow of execution based on specific conditions. In Java, they allow the program to make decisions and execute different blocks of code.

### Types of Conditional Statements
1. `if-else` statement
2. `else-if` statement
3. Ternary operator
4. `switch` statement

---

## if-else Statement
The `if-else` statement executes a block of code if a condition is true, and another block if it is false.

```java
if (condition) { 
    // code executed if true
} else {
    // code executed if false
}
```

> [!IMPORTANT]
> If you use multiple `if` statements sequentially, each one is evaluated independently. If the first is true, Java will still check the following conditions.

### Largest of Two Numbers
```java
int a = 1, b = 3;
if (a > b) {
    System.out.println("A is greater than B");
} else {
    System.out.println("B is greater than A");
}
```

### Even or Odd Number
```java
int n = sc.nextInt();
if (n % 2 == 0) {
    System.out.println(n + " is an Even Number");
} else {
    System.out.println(n + " is an Odd Number");
}
```

---

## else-if Statement
The `else-if` ladder is used when there are multiple conditions to check. Once a condition is found to be true, the rest of the ladder is skipped, saving computation time.

```java
if (a > b) {
    System.out.println("A is greater than B");
} else if (a == b) {
    System.out.println("A is equal to B");
} else {
    System.out.println("B is greater than A");
}
```

### Income Tax Calculator
```java
int income = sc.nextInt();
int tax;

if (income <= 500000) {
    tax = 0;
} else if (income > 500000 && income <= 1000000) {
    tax = (int) (0.2 * income);
} else {
    tax = (int) (0.3 * income);
}

System.out.println("Your Tax is : " + tax);
```

### Largest of Three Numbers
```java
int A = 1, B = 3, C = 6;

if ((A >= B) && (A >= C))
    System.out.println("A is largest");
else if (B >= C)
    System.out.println("B is largest");
else
    System.out.println("C is largest");
```

---

## Ternary Operator
The ternary operator is a shorthand for `if-else`. It uses three operands.

**Syntax:** `variable = (condition) ? statement1 : statement2;`

- **`?`**: Checks the condition. If `true`, returns `statement1`.
- **`:`**: If `false`, returns `statement2`.

```java 
String type = ((5 % 2) == 0) ? "Even" : "Odd";
System.out.println(type); // Output: Odd
```

---

## Switch Statement
A `switch` statement allows a variable to be tested for equality against a list of values (cases).

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // default code
}
```

> [!NOTE]
> The `break` keyword is crucial. Without it, the execution "falls through" to the next cases regardless of whether they match.

### Calculator Program
```java
char Operator = sc.next().charAt(0);

switch (Operator) {
    case '+': System.out.println("Sum is " + (Number1 + Number2)); break;
    case '-': System.out.println("Sub is " + (Number1 - Number2)); break;
    case '*': System.out.println("Product is " + (Number1 * Number2)); break;
    case '/': System.out.println("Quotient is " + (Number1 / Number2)); break;
    case '%': System.out.println("Remainder is " + (Number1 % Number2)); break;
    default: System.out.println("Invalid Operator");
}
```

---

## Practice Questions

1. **Positive, Negative, or Zero**: Write a program to get a number from the user and print whether it is positive, negative, or zero.
   - [Solution](./Solutions/SolutionOne.java)
2. **Fever Check**: Finish the code to check if you have a fever (temperature > 100).
   - [Solution](./Solutions/SolutionTwo.java)
3. **Week Days**: Write a program to input a week number (1-7) and print the day of the week using a switch statement.
   - [Solution](./Solutions/SolutionThree.java)
4. **Ternary Operator Analysis**: What will be the value of `x` & `y` in the following program?
   ```java
   public class Solution {
       public static void main(String args[]) {
           int a = 63, b = 36;
           boolean x = (a < b) ? true : false;
           int y = (a > b) ? a : b;
       }
   }
   ```
   **Answer:** `x = false`, `y = 63`.
5. **Leap Year**: Write a program that takes a year from the user and prints whether it is a leap year or not.
   - [Solution](./Solutions/SolutionFive.java)
