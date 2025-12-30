# Loops

We use loops to repeat a block of code multiple times when we know the condition for how long to repeat it.

## Table of Contents
- [Types of Loops](#types-of-loops)
- [While Loop](#while-loop)
- [For Loop](#for-loop)
- [Do-While Loop](#do-while-loop)
- [Loop Control Statements](#loop-control-statements)
  - [break](#break)
  - [continue](#continue)
- [Practice Questions](#practice-questions)

---

## Types of Loops

1.  **For Loop**: Best when the number of iterations is known.
2.  **While Loop**: Best when the condition is evaluated before each iteration.
3.  **Do-While Loop**: Best when the loop body should execute at least once.

---

## While Loop

The `while` loop repeats a block of code as long as the condition is true.

```java
while (condition) {
    // code to be executed
}
```

> [!NOTE]
> If the condition is always `true`, the loop will run infinitely until memory is exhausted. Always ensure the loop has an exit condition!

### Example: Print Numbers from 1 to 10

```java
int number = 1;
while (number <= 10) {
    System.out.println(number);
    number++;
}
```

### Example: Print Numbers from 1 to N

```java
int n = sc.nextInt();
int number = 1;
while (number <= n) {
    System.out.println(number);
    number++;
}
```

### Example: Sum of First N Natural Numbers

```java
int range = sc.nextInt();
int c = 1;
int sum = 0;
while (c <= range) {
    sum += c;
    c++;
}
System.out.print(sum);
```

### Example: Print Digits of a Number in Reverse

```java
int numberToBeReversed = 10899;

while (numberToBeReversed > 0) {
    int lastDigit = numberToBeReversed % 10;
    System.out.print(lastDigit);
    numberToBeReversed = numberToBeReversed / 10;
}
```

### Example: Reverse a Number

```java
int no = 12345;
int rev = 0;

while (no > 0) {
    int ld = no % 10;
    rev = (rev * 10) + ld;
    no = no / 10;
}

System.out.println(rev); // Output: 54321
```

---

## For Loop

The `for` loop combines initialization, condition, and update into a single line.

```java
for (initialization; condition; update) {
    // code to be executed
}
```

| Part | Description |
| :--- | :--- |
| **Initialization** | Runs once at the start. Typically used to declare the loop counter. |
| **Condition** | Evaluated before each iteration. Loop continues if `true`. |
| **Update** | Runs after each iteration. Typically used to increment/decrement the counter. |

### Example: Print a Simple Pattern

```java
for (int j = 0; j < 4; j++) {
    System.out.println("****");
}
```

---

## Do-While Loop

The `do-while` loop executes the code block **at least once** before checking the condition.

```java
do {
    // code to be executed
} while (condition);
```

### Example: Print Numbers from 1 to 10

```java
int counter = 1;
do {
    System.out.println(counter);
    counter++;
} while (counter <= 10);
```

---

## Loop Control Statements

### break

The `break` statement is used to exit a loop immediately.

```java
do {
    int n = sc.nextInt();
    if (n % 10 == 0) {
        break; // Exit the loop if n is a multiple of 10
    }
    System.out.println(n);
} while (true);
```

### continue

The `continue` statement skips the current iteration and moves to the next one.

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        continue; // Skip printing when i is 3
    }
    System.out.println(i); // Output: 0, 1, 2, 4
}
```

---

## Practice Questions

### Question 1

How many times is 'Hello' printed?

```java
public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }
    }
}
```

> [!TIP]
> **Answer: 2 times**
>
> **Reasoning:**
> 1.  `i = 0`: Print "Hello", `i` becomes `2` (`i += 2`), then `3` (`i++`).
> 2.  `i = 3`: Print "Hello", `i` becomes `5` (`i += 2`), then `6` (`i++`).
> 3.  `i = 6`: Condition `6 < 5` is false. Loop terminates.

---

### Question 2

Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

> [!NOTE]
> See [SolutionTwo.java](./Solutions/SolutionTwo.java) for the answer.

---

### Question 3

Write a program to find the factorial of any number entered by the user.

> [!NOTE]
> See [SolutionThree.java](./Solutions/SolutionThree.java) for the answer.

---

### Question 4

Write a program to print the multiplication table of a number N, entered by the user.

> [!NOTE]
> See [SolutionFour.java](./Solutions/SolutionFour.java) for the answer.

---

### Question 5

What is wrong in the following program?

```java
public class Solution {
    public static void main(String args[]) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);
    }
}
```

> [!WARNING]
> **Answer: Compiler Error**
>
> **Reasoning:**
> The variable `i` is declared inside the `for` loop's initialization. Its **scope** is limited to the loop block. When you try to access it after the loop, the compiler throws a "cannot find symbol" error.
