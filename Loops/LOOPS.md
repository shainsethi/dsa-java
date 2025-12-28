# Loops
we use loops to repeat a block of code multiple times and we know till when to repeat it

## Types of Loops
1. For Loop
2. While Loop
3. Do While Loop

# while loop

```java
while (condition) {
    // code
}
```
> [!NOTE]
> if we give a condition which is always true then it will go into infinite loop untill the memory is full. care we should not give a condition which is always true

### PRINT NUMBERS FROM 1 TO 10
```java
int number = 1;
while (number <= 10) {
    System.out.println(number);
    number++;
}
```
### PRINT NUMBERS FROM 1 TO N
```java
n = sc.nextInt();
int number = 1;
while (number <= n) {
    System.out.println(number);
    number++;
}
```

### SUM OF FIRST N NATURAL NUMBERS
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

### FOR loop

```
for(initialization; condition ; updation){
    // code
}
```
for loops combines 3 statements into one line and thats why we use statement terminator between them .
+ initialization is basically our iterator and for loop only read its once in starting 
+ condition is the same as while loop basically till when loop will run
+ updation is how iterator will change after each iteration

### Print pattern
```java
   for (int j = 0; j < 4; j++) {
            System.out.println("****");
        }
```

#### print reverse of a number
```java
int numberToBeReversed = 10899;

while (numberToBeReversed > 0) {
    int lastDigit = numberToBeReversed % 10;
    System.out.print(lastDigit);
    numberToBeReversed = numberToBeReversed / 10;
}
```

#### reverse the given number
```java
int no = 12345;
int rev = 0;

while (no > 0) {
    int ld = no % 10;
    rev = (rev * 10) + ld;
    no = no / 10;
}

System.out.println(rev);
```

#### do while loop
do while loop first run the code then check the condition 

```java
int counter = 1;
do {
    System.out.println(counter);
    counter++;
} while (counter <= 10);
```

#### break 
break is used to exit the loop . it will even exit an infinite loop.

```java
do {
    int n = sc.nextInt();
    if (n % 10 == 0) {
        break;
    }
    System.out.println(n);
} while (true);
```

#### continue 
continue is used to skip the current iteration and move to the next iteration.

```java
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

#### number is prime 
check prime number java 

---

## Practice Questions

### Question 1
How many times 'Hello' is printed?

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
> 1. Initially `i = 0`. Since `0 < 5`, "Hello" is printed. Then `i` becomes `2` (`i += 2`), and the loop increment `i++` makes `i = 3`.
> 2. Now `i = 3`. Since `3 < 5`, "Hello" is printed. Then `i` becomes `5` (`i += 2`), and the loop increment `i++` makes `i = 6`.
> 3. Now `i = 6`. Since `6` is not `< 5`, the loop terminates.

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
> The variable `i` is declared inside the `for` loop's initialization. Its **scope** is limited to the loop itself. When you try to print it on the last line, it is no longer available, leading to a "cannot find symbol" error.

