# Practice Question Solutions

This document contains flowcharts and pseudo-code for the practice questions listed in [FLOWCHART.md](./FLOWCHART.md).

---

#### 1. Calculate the Area of a Circle

**Input:**
- Radius of the circle: `r`

**Output:**
- Area of the circle: `area`

**Flowchart:**
```mermaid
flowchart TD
    Start([Start]) --> Input[/Input r/]
    Input --> Process["area = 3.14 * r * r"]
    Process --> Print[/Print area/]
    Print --> End([Exit])
```

**Pseudo-code:**
```text
BEGIN
    READ r
    CALCULATE area = 3.14 * r * r
    PRINT area
END
```

---

#### 2. Find the Greatest of Two Numbers

**Input:**
- First Number: `a`
- Second Number: `b`

**Output:**
- The greater number

**Flowchart:**
```mermaid
flowchart TD
    Start([Start]) --> Input[/Input a, b/]
    Input --> Decision{Is a > b?}
    Decision -- Yes --> PrintA[/Print a/]
    Decision -- No --> PrintB[/Print b/]
    PrintA --> End([Exit])
    PrintB --> End
```

**Pseudo-code:**
```text
BEGIN
    READ a
    READ b
    IF a > b THEN
        PRINT a
    ELSE
        PRINT b
    ENDIF
END
```

---

#### 3. Print Even Numbers Between 9 and 100

**Input:**
- None (Range: 9 to 100)

**Output:**
- Even numbers: 10, 12, ..., 100

**Flowchart:**
```mermaid
flowchart TD
    Start([Start]) --> Init[num = 10]
    Init --> LoopCheck{"num <= 100?"}
    LoopCheck -- Yes --> Print[/Print num/]
    Print --> Increment[num = num + 2]
    Increment --> LoopCheck
    LoopCheck -- No --> End([Exit])
```

**Pseudo-code:**
```text
BEGIN
    SET num = 10
    WHILE num <= 100
        PRINT num
        num = num + 2
    ENDWHILE
END
```

---

#### 4. Calculate the Average of 25 Exam Scores

**Input:**
- 25 Exam scores

**Output:**
- Average of the scores: `avg`

**Flowchart:**
```mermaid
flowchart TD
    Start([Start]) --> Init[sum = 0, count = 1]
    Init --> LoopCheck{"count <= 25?"}
    LoopCheck -- Yes --> Input[/Input score/]
    Input --> Add[sum = sum + score]
    Add --> Inc[count = count + 1]
    Inc --> LoopCheck
    LoopCheck -- No --> Calc["avg = sum / 25"]
    Calc --> Print[/Print avg/]
    Print --> End([Exit])
```

**Pseudo-code:**
```text
BEGIN
    SET sum = 0
    SET count = 1
    WHILE count <= 25
        READ score
        sum = sum + score
        count = count + 1
    ENDWHILE
    SET avg = sum / 25
    PRINT avg
END
```
