# Patterns Advance 🚀

Advanced patterns in Java require a deep understanding of **Nested Loops** and **Conditional Statements**. Here's the core logic used to solve these problems.

## 🧠 Core Logic Breakdown

To solve any complex pattern, follow these three fundamental steps:

### 1. Count Number of Rows (Outer Loop)
The outer loop typically controls the number of horizontal lines (rows) you want to print.
- **Rule**: If there are `n` rows, the loop runs from `1` to `n`.
- **Java Syntax**:
  ```java
  for (int i = 1; i <= rows; i++) {
      // Logic for each row
  }
  ```

### 2. Count Number of Columns (Inner Loop)
The inner loop controls what happens inside each row. It determines the number of characters (stars, spaces, or numbers) in a single horizontal line.
- **Rule**: The number of columns might be constant or depend on the current row number `i`.
- **Java Syntax**:
  ```java
  for (int j = 1; j <= columns; j++) {
      // Decide WHAT to print at (i, j)
  }
  ```

### 3. Check WHAT to Print
Inside the inner loop, use conditional logic (`if-else`) to decide which character to print based on the coordinates `(i, j)`.
- **Hollow Rectangle**: Print `*` only if it's the first/last row or first/last column.
- **Spaces**: Use `System.out.print(" ")` to skip positions.
- **New Line**: After the inner loop finishes, use `System.out.println()` to move to the next row.

---

## 📝 Practice Questions

The following patterns are implemented in [PatternsAdvance.java](./PatternsAdvance.java). Feel free to explore and try them out!

### 1. [Hollow Rectangle](./PatternsAdvance.java#L11)
```
*****
*   *
*   *
*****
```

### 2. [Inverted & Rotated Half-Pyramid](./PatternsAdvance.java#L24)
```
   *
  **
 ***
****
```

### 3. [Inverted Half-Pyramid with Numbers](./PatternsAdvance.java#L37)
```
12345
1234
123
12
1
```

### 4. [Butterfly Pattern](./PatternsAdvance.java#L79)
```
*      *
**    **
***  ***
********
***  ***
**    **
*      *
```

### 5. [Solid Rhombus](./PatternsAdvance.java#L111)
```
    *****
   *****
  *****
 *****
*****
```

### 6. [Hollow Rhombus](./PatternsAdvance.java#L123)
```
    *****
   *   *
  *   *
 *   *
*****
```

### 7. [Diamond Pattern](./PatternsAdvance.java#L139)
```
   *
  ***
 *****
*******
 *****
  ***
   *
```

### 8. [Number Pyramid](./PatternsAdvance.java#L161)
```
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5
```

### 9. [Palindromic Pattern with Numbers](./PatternsAdvance.java#L175)
```
    1
   212
  32123
 4321234
543212345
```

