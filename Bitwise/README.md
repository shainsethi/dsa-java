# Module: Bit Manipulation (Bitwise Operations) 

Welcome to the Bitwise module! This guide covers the fundamentals of bit manipulation and how computers process numbers at the most basic level.

## Table of Contents
1. [Introduction to Bit Manipulation](#1-introduction-to-bit-manipulation)
2. [Binary vs Decimal Number System](#2-binary-vs-decimal-number-system)
    - [MSB and LSB Explained](#msb-and-lsb-explained)
3. [Bitwise Operators Explained](#3-bitwise-operators-explained)
    - [Detailed Operator Breakdown](#detailed-operator-breakdown)
4. [Understanding the 1's Complement (`~`) and Negative Numbers](#4-understanding-the-1s-complement--and-negative-numbers)
    - [How Computers Store Negative Numbers: Two's Complement](#how-computers-store-negative-numbers-twos-complement)
    - [The Shortcut Formula](#the-shortcut-formula)

---

### 1. Introduction to Bit Manipulation
**Bit manipulation** is the act of algorithmically manipulating bits or other pieces of data shorter than a byte. It allows us to perform operations directly on the binary representation of numbers. 

Since computers inherently operate in binary, bitwise operations are blazingly fast and are often used for extreme performance optimization.

---

### 2. Binary vs Decimal Number System

| Feature | Decimal System (Base-10) | Binary System (Base-2) |
| --- | --- | --- |
| **Used By** | Humans in everyday math | Computers and transistors |
| **Possible Values** | `0, 1, 2, 3, 4, 5, 6, 7, 8, 9` | `0, 1` (On / Off) |

Every number you type in a computer is converted into a sequence of `0`s and `1`s before the CPU processes it.

#### MSB and LSB Explained
When looking at a binary number (e.g., `10010110`), we identify the ends of the number as follows:
- **MSB (Most Significant Bit)**: The extreme leftmost bit. This bit carries the greatest positional value. In signed integers, the MSB acts as the **"Sign Bit"** (`0` for positive, `1` for negative). 
- **LSB (Least Significant Bit)**: The extreme rightmost bit. This bit carries the lowest positional value. A cool trick: the LSB determines if a number is Even or Odd. If the LSB is `1`, the number is odd; if `0`, it is even.

---

### 3. Bitwise Operators Explained
Java provides several operators that act directly upon the bits of their operands:

| Operator | Name | Description | Example |
| :---: | --- | --- | --- |
| `&` | **Bitwise AND** | Result bit is `1` only if *both* bits are `1`. | `1010 & 1100 = 1000` |
| `\|` | **Bitwise OR** | Result bit is `1` if *either* bit is `1`. | `1010 \| 1100 = 1110` |
| `^` | **Bitwise XOR** | Result bit is `1` if bits are *different*, `0` if same. | `1010 ^ 1100 = 0110` |
| `<<` | **Left Shift** | Shifts bits to the left, filling empty spaces on the right with `0`. (Multiplies by 2) | `5 << 1 = 10` |
| `>>` | **Right Shift** | Shifts bits to the right. (Divides by 2) | `5 >> 1 = 2` |
| `~` | **Bitwise NOT** | Inverts the bits (1's complement). `0` becomes `1`, and `1` becomes `0`. | `~5 = -6` |

#### Detailed Operator Breakdown

- **Bitwise AND (`&`)**: Think of it as logical multiplication. Both bits must be "true" (`1`) for the output to be `1`. This is commonly used in **Bit Masking** to turn "off" certain bits or extract a specific bit's value.
- **Bitwise OR (`|`)**: Think of it as logical addition. As long as any one bit is `1`, the output is `1`. This is commonly used to manually turn "on" specific bits.
- **Bitwise XOR (`^`)**: The "exclusive" OR. The output is `1` only if the bits are mismatched/different. A powerful property of XOR is that `N ^ N = 0` (a number XOR'd with itself is 0), which is heavily used for finding unique numbers in an array.
- **Left Shift (`<<`)**: Physically pushes all bits to the left, adding `0`s on the right empty spaces. Shifting a number `a` left by `b` places means **multiplying** it to $a * 2^b$. 
  - **✨ Shortcut for $2^b$:** To instantly calculate 2 to the power of `b`, just run `1 << b`.
- **Right Shift (`>>`)**: Physically pushes bits to the right. The leftmost empty spaces are filled with the original sign bit (this is called an *Arithmetic Shift*). Shifting a number `a` right by `b` places means **dividing** it: $a / 2^b$.
- **Unsigned Right Shift (`>>>`)**: (Java specific) Pushes bits right, but blindly fills the leftmost spaces with `0`, completely ignoring whether the original number was positive or negative (this is called a *Logical Shift*).

---

### 4. Understanding the 1's Complement (`~`) and Negative Numbers

The Bitwise NOT (`~`) operator is a unary operator that flips every single bit of a number. This is also called taking the **1's Complement**.

For example, if you have a binary number `0000 0101` (which is `5` in decimal):
Applying NOT (`~`) gives you `1111 1010`.

**Wait, what does `1111 1010` equal in decimal?**
Here is where we need to understand how computers represent **negative numbers**.

#### How Computers Store Negative Numbers: Two's Complement
To represent negative numbers, computers use a system called **2's Complement**. 
The **Most Significant Bit (MSB)**—the extreme leftmost bit—is used as the "Sign Bit":
- If the **MSB is `0`**, the number is **positive**.
- If the **MSB is `1`**, the number is **negative**.

When you flip all the bits of `5` (`~5`), you turned a positive number (`0000 0101`) into what looks like a negative number (`1111 1010`) because the sign bit (the leftmost bit) became `1`.

**To find out the actual decimal value of a negative binary number stored in memory, the computer reads it by performing a 2's Complement on it.**
To find the 2's Complement of a number:
1. **Take the 1's Complement:** Flip all bits (`0` to `1` and `1` to `0`).
2. **Add 1:** Add 1 to the result.

**Let's see how the computer evaluates `~5` in Java:**
1. `5` in 32-bit binary is `0000 0000 ... 0101`
2. `~5` (1's complement) becomes `1111 1111 ... 1010`.
3. The computer sees the leftmost bit is `1`, so it knows this is a **negative number**.
4. To translate this back to decimal for you to read, the computer takes the 2's complement of that binary sequence to find its magnitude:
   - Step 1: Flip it back (1's complement) -> `0000 0000 ... 0101`
   - Step 2: Add 1 -> `0000 0000 ... 0110` (which equals `6` in decimal).
5. Since we knew from the sign bit that it was negative, the final answer output is `-6`.

So, in summary: `~5 == -6`.

#### The Shortcut Formula
For any integer `N`, the bitwise NOT operation can always be mathematically evaluated as:  
**`~N = -(N + 1)`**

**Examples:**
- `~5 = -(5 + 1) = -6`
- `~10 = -(10 + 1) = -11`
- `~(-3) = -(-3 + 1) = 2`

---
*Back to [Root README](../README.md)*
