# Module: Strings in Java 

Welcome to the Strings module! This guide covers everything you need to know about Strings in Java, formatted as a comprehensive Q&A.

## Table of Contents
1. [What is a String?](#1-what-is-a-string)
2. [How do we create a String? (Two Methods)](#2-how-do-we-create-a-string-two-methods)
3. [How to Input and Output a String?](#3-how-to-input-and-output-a-string)
4. [What does the `length()` function do?](#4-what-does-the-length-function-do)
5. [What is the `charAt()` method?](#5-what-is-the-charat-method)
6. [How does String `concat()` work?](#6-how-does-string-concat-work)
7. [How does the `equals()` method work?](#7-how-does-the-equals-method-work)
8. [What is a `substring()`?](#8-what-is-a-substring)
9. [Why are Strings immutable?](#9-why-are-strings-immutable)
10. [What is the difference between normal String literal and `new` keyword?](#10-what-is-the-difference-between-normal-string-literal-and-new-keyword)
11. [String vs StringBuilder vs StringBuffer](#11-string-vs-stringbuilder-vs-stringbuffer)
12. [What is String Interning?](#12-what-is-string-interning)

## Practice Problems
- [Problem 1: Count Vowels](#problem-1-count-vowels)
- [Problem 2: Anagrams Check](#problem-2-anagrams-check)

---

### 1. What is a String?
In Java, a **String** is a sequence of characters. It is not a primitive data type like `int` or `char`. Instead, a String is an **Object** representing an array of characters. Strings are widely used to store text.

---

### 2. How do we create a String? (Two Methods)
There are two primary ways to create a String in Java:

**Method 1: By String Literal**
```java
String str1 = "Hello World!";
```
This is the most common way. Java uses a special memory space called the **String Pool** to store literals.

**Method 2: By using the `new` Keyword**
```java
String str2 = new String("Hello World!");
```
This always creates a new object in the **Heap memory**, regardless of whether the same string already exists in the String Pool.

---

### 3. How to Input and Output a String?
**Input:** We use the `Scanner` class to read string input from the user.
- `next()`: reads a single word (stops at the first space).
- `nextLine()`: reads an entire line including spaces.

```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
```

**Output:** We use standard print statements.
```java
System.out.println("Your name is: " + name);
```

---

### 4. What does the `length()` function do?
The `length()` method returns the total number of characters present in the string.
```java
String text = "Java";
System.out.println(text.length()); // Output: 4
```

---

### 5. What is the `charAt()` method?
The `charAt(int index)` method returns the character located at the specified index. Strings are 0-indexed.
```java
String text = "Java";
System.out.println(text.charAt(0)); // Output: J
System.out.println(text.charAt(2)); // Output: v
```

---

### 6. How does String `concat()` work?
The `concat()` method (or the `+` operator) is used to join two or more strings together.
```java
String first = "Hello ";
String second = "World";
System.out.println(first.concat(second)); // Output: Hello World
// or
System.out.println(first + second);       // Output: Hello World
```

---

### 7. How does the `equals()` method work?
The `equals()` method compares the **actual content** of two strings. 

*Note: You should never use `==` to compare the contents of two strings because `==` compares the memory addresses (reference equality), not the values.*
```java
String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");

System.out.println(s1.equals(s2)); // true
System.out.println(s1.equals(s3)); // true
```

---

### 8. What is a `substring()`?
A substring is a smaller part of a string. You use the `substring(startIndex, endIndex)` method to extract part of a String. (The `startIndex` is inclusive, and the `endIndex` is exclusive).
```java
String word = "Programming";
System.out.println(word.substring(3, 7)); // Output: gram

// If you only provide startIndex:
System.out.println(word.substring(7));    // Output: ming
```

---

### 9. Why are Strings immutable?
In Java, **Strings are immutable**, meaning their values cannot be changed or modified after they are created. 

**Why?**
Every time you try to modify a string (like concatenating), Java actually creates a **brand new string object** in memory with the new value, rather than changing the original one. This happens to keep the **String Pool** safe. If strings were mutable, changing a string shared by many variables would dangerously affect all of them. It also makes Strings thread-safe and more secure.

---

### 10. What is the difference between normal String literal and `new` keyword?
| Aspect | String Literal (`String s = "Hello";`) | `new` Keyword (`String s = new String("Hello");`) |
| --- | --- | --- |
| **Memory Area** | String Constant Pool (inside the Heap) | Heap Memory (outside the String Pool) |
| **Duplication** | Checks the pool. If it already exists, no new object is created; it returns the existing reference. | Always creates a brand new object in the Heap, even if the value already exists. |

---

### 11. String vs StringBuilder vs StringBuffer
Because Strings are immutable, modifying them repeatedly in a loop is very slow (creating new objects every time). To solve this, Java provides mutable string classes.

| Feature | `String` | `StringBuilder` | `StringBuffer` |
| --- | --- | --- | --- |
| **Mutability** | Immutable (Cannot be changed) | Mutable (Can be changed) | Mutable (Can be changed) |
| **Thread-Safety**| Thread-Safe | **Not** Thread-Safe | Thread-Safe (Synchronized) |
| **Performance** | Slowest (if modified heavily) | **Fastest** | Slower than StringBuilder (due to synchronization lock) |

*Use `StringBuilder` when you need to construct or manipulate strings dynamically in a single-threaded environment.*

---

### 12. What is String Interning?
**String Interning** is a method of storing only one copy of each distinct String value, which must be immutable. In Java, this is achieved using the **String Pool**. 

When a string is created using a literal (e.g., `String s = "Hello";`), Java automatically "interns" it. If you create a String using the `new` keyword (e.g., `String s = new String("Hello");`), it is placed in the general Heap memory, not the pool.

You can manually move a string to the String Pool by calling the `intern()` method:
```java
String s1 = new String("Java");   // Created in Heap
String s2 = s1.intern();          // Moves/Checks in String Pool

String s3 = "Java";
System.out.println(s2 == s3);     // Output: true
```

---

## Practice Problems

### Problem 1: Count Vowels
**Question:** Count how many times lowercase vowels occurred in a String entered by the user.

**Solution:** [SolutionOne.java](./Problems/SolutionOne.java)

### Problem 2: Anagrams Check
**Question:** Determine if 2 Strings are anagrams of each other. What are anagrams? If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider *race* and *care*. In this case, *race*'s characters can be formed into *care*, or *care*'s characters can be formed into *race*. 

**Solution:** [SolutionTwo.java](./Problems/SolutionTwo.java)

---
*Back to [Root README](../README.md)*
