# Operators: Practice Solutions

This document contains solutions and detailed explanations for the practice questions in the [Operators Concepts](./OPERATORS.md) guide.

---

### Solution 1: Arithmetic Expression
**Output:** `5 , 4`

**Explanation:**
- `exp1 = (x * y / x)`: Evaluated Left-to-Right. `(2 * 5) / 2 = 10 / 2 = 5`.
- `exp2 = (x * (y / x))`: Evaluated Parentheses first. `2 * (5 / 2) = 2 * 2 = 4` (Integer division).

---

### Solution 2: Logical Operators
**Output:** `Java`

**Explanation:**
- `if(x > y && y > z)`: `200 > 50` (true) AND `50 > 100` (false) → `false`.
- `if(z > y && z < x)`: `100 > 50` (true) AND `100 < 200` (true) → `true`. Prints **"Java"**.
- `if((y+200) < x && (y+150) < z)`: `250 < 200` (false) AND `200 < 100` (false) → `false`.

---

### Solution 3: Assignment Operators
**Output:** `4 0 0`

**Explanation:**
- `x = y = z = 2`: All variables initialized to `2`.
- `x += y`: `x = 2 + 2 = 4`.
- `y -= z`: `y = 2 - 2 = 0`.
- `z /= (x + y)`: `z = 2 / (4 + 0) = 2 / 4 = 0` (Integer division).

---

### Solution 4: Complex Expression
**Output:** `278`

**Explanation:**
- `4/3 * (x + 34)`: `1 * (9 + 34) = 43`.
- `9 * (a + b * c)`: `9 * (2 + 24) = 9 * 26 = 234`.
- `(3 + y * (2 + a)) / (a + b * y)`: `(3 + 12 * 4) / (2 + 4 * 12) = 51 / 50 = 1`.
- **Total:** `43 + 234 + 1 = 278`.

---

### Solution 5: Evaluation Order
**Output:**
```
20
20
```

**Explanation:**
- `exp1 = (5 * (10 / 5 + 10 / 5))`: Parentheses first. `5 * (2 + 2) = 5 * 4 = 20`.
- `exp2 = (5 * 10 / 5 + 5 * 10 / 5)`: Multiplicative operators Left-to-Right. `(50 / 5) + (50 / 5) = 10 + 10 = 20`.

---
*Back to [Operators Concepts](./OPERATORS.md)*
