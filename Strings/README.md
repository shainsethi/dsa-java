# Module 11: Strings 🧵

Strings are a sequence of characters in Java. Unlike in some other languages, Strings in Java are **objects** that are immutable (cannot be changed once created).

## 📌 Key Concepts

- **String Immutability**: Strings are immutable in Java for security, caching, and performance reasons.
- **String Pool**: A special memory area in the Heap where Java stores String literals to save memory.
- **`String` vs `StringBuilder` vs `StringBuffer`**:
    - `String`: Immutable, slow for frequent modifications.
    - `StringBuilder`: Mutable, fast, not thread-safe.
    - `StringBuffer`: Mutable, thread-safe, slower than `StringBuilder`.
- **String Methods**: `length()`, `charAt()`, `substring()`, `equals()`, `compareTo()`, etc.

## 💻 Java Source Code

- **Core Code**: [Palindrome Checker](./Palindrome.java)

### Palindrome Check Logic
To check if a string is a palindrome:
1. Compare characters from the beginning (`i`) and the end (`n-1-i`).
2. If any character doesn't match, it's not a palindrome.
3. Only need to traverse up to `length / 2`.

---
*Back to [Root README](../README.md)*
