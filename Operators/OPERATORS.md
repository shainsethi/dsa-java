# Operators in Java

## Table of Contents
- [Introduction](#introduction)
- [Arithmetic Operators](#arithmetic-operators)
    - [Binary Operators](#binary-operators)
    - [Unary Operators](#unary-operators)
- [Relational Operators](#relational-operators)
- [Logical Operators](#logical-operators)
- [Assignment Operators](#assignment-operators)
- [Operator Precedence & Associativity](#operator-precedence--associativity)
- [Practice Questions](#practice-questions)

---

## Introduction
Operators are symbols that tell the compiler to perform specific mathematical or logical manipulations.

### Operation (Expression)
An expression consists of two components:
1. **Operands**: The values or variables on which the operation is performed.
2. **Operator**: The symbol representing the operation (e.g., `+`, `-`, `*`).

> [!NOTE]
> An operand and an operator together perform an operation.

### Types of Operators
- **Arithmetic Operators** (Binary, Unary, Ternary)
- **Relational Operators**
- **Logical Operators**
- **Bitwise Operators**
- **Assignment Operators**

> [!TIP]
> We will cover **Bitwise Operators** and the **Ternary Operator** in detail in upcoming sections.

---

## Arithmetic Operators

### Binary Operators
Binary operators perform operations on two operands.

| Operator | Name | Description | Example (`a=10, b=5`) |
| :--- | :--- | :--- | :--- |
| **+** | Addition | Adds two operands | `a + b = 15` |
| **-** | Subtraction | Subtracts second operand from first | `a - b = 5` |
| **\*** | Multiplication | Multiplies two operands | `a * b = 50` |
| **/** | Division | Divides first operand by second | `a / b = 2` |
| **%** | Modulus | Returns the remainder of division | `a % b = 0` |

### Unary Operators
Unary operators perform operations on a single operand.

- **Increment (`++`)**:
    - **Pre-increment (`++a`)**: Updates the value in memory first, then uses it.
    - **Post-increment (`a++`)**: Uses the current value first, then updates it in memory.
- **Decrement (`--`)**:
    - **Pre-decrement (`--a`)**: Updates the value in memory first, then uses it.
    - **Post-decrement (`a--`)**: Uses the current value first, then updates it in memory.

---

## Relational Operators
Relational operators evaluate a relationship between two operands and return a `boolean` value (`true` or `false`).

| Operator | Description |
| :--- | :--- |
| **==** | Equal to |
| **!=** | Not equal to |
| **>** | Greater than |
| **<** | Less than |
| **>=** | Greater than or equal to |
| **<=** | Less than or equal to |

---

## Logical Operators
Logical operators are used to combine multiple conditional statements.

- **`&&` (Logical AND)**: Returns `true` if both conditions are true.
- **`||` (Logical OR)**: Returns `true` if at least one condition is true.
- **`!` (Logical NOT)**: Reverses the boolean state (returns `true` if the condition is false).

---

## Assignment Operators
Assignment operators are used to assign values to variables.

| Operator | Example | Equivalent to |
| :--- | :--- | :--- |
| **=** | `a = 10` | `a = 10` |
| **+=** | `a += 10` | `a = a + 10` |
| **-=** | `a -= 10` | `a = a - 10` |
| **\*=** | `a *= 10` | `a = a * 10` |
| **/=** | `a /= 10` | `a = a / 10` |
| **%=** | `a %= 10` | `a = a % 10` |

---

## Operator Precedence & Associativity
Operator precedence determines the order in which operators in an expression are evaluated.

### Example
```java
int x = 3 * 4 - 1;
```
Here, `x` will be `11`, not `9`. This is because `*` has higher precedence than `-`. The expression is evaluated as `(3 * 4) - 1`.

### Associativity
If an expression has two operators with the same precedence, they are evaluated according to their **associativity** (either Left-to-Right or Right-to-Left).

### Precedence Table

| Operators | Precedence | Associativity |
| :--- | :--- | :--- |
| `()`, `[]`, `.`, `postfix ++/--` | Postfix | Left to Right |
| `unary +/-`, `prefix ++/--`, `!`, `~` | Unary | Right to Left |
| `*`, `/`, `%` | Multiplicative | Left to Right |
| `+`, `-` | Additive | Left to Right |
| `<<`, `>>`, `>>>` | Shift | Left to Right |
| `<`, `<=`, `>`, `>=` | Relational | Left to Right |
| `==`, `!=` | Equality | Left to Right |
| `&` | Bitwise AND | Left to Right |
| `^` | Bitwise XOR | Left to Right |
| `\|` | Bitwise OR | Left to Right |
| `&&` | Logical AND | Left to Right |
| `\|\|` | Logical OR | Left to Right |
| `?:` | Ternary | Right to Left |
| `=`, `+=`, `-=`, `*=`, `/=`, `%=` | Assignment | Right to Left |

> [!NOTE]
> Most of these rules follow standard mathematical logic. You don't need to memorize the entire table at once!

---

## Practice Questions

### Question 1: Arithmetic Expression
What will be the output of the following program?
```java
public class Test {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}
```

### Question 2: Logical Operators
What will be the output of the following program?
```java
public class Test {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        if(x > y && y > z) {
            System.out.println("Hello");
        }
        if(z > y && z < x) {
            System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z) {
            System.out.println("Hello Java");
        }
    }
}
```

### Question 3: Assignment Operators
What will be the output of the following program?
```java
public class Test {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}
```

### Question 4: Complex Expression
What will be the output of the following program?
```java
public class Test {
    public static void main(String[] args) {
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
        System.out.println(exp);
    }
}
```

### Question 5: Evaluation Order
What will be the output of the following program?
```java
public class Test {
    public static void main(String[] args) {
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
```
---

👉 **[View Solutions](./SOLUTIONS.md)**
