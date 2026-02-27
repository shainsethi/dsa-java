# 2D Arrays in Java

A 2D array can be represented as a matrix consisting of rows and columns. It is used to store data in a two-dimensional format (often conceptualized as X and Y axes). In Java, a 2D array is essentially an **array of arrays**.

## 1. Declaration and Initialization

There are multiple ways to declare and initialize a 2D array in Java.

### Syntax for Declaration:
```java
// Method 1 (Recommended)
int[][] matrix;

// Method 2 (Valid, but less common)
int matrix[][];
```

### Initializing with a Fixed Size:
When you know the dimensions beforehand, you can specify the number of rows and columns.
```java
// Creates a 2D array with 3 rows and 4 columns
int[][] matrix = new int[3][4]; 
```

### Initializing with Values:
You can directly initialize the elements during declaration.
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

## 2. Accessing and Modifying Elements

Elements in a 2D array are accessed using two indices: `array[row_index][column_index]`. The indices are zero-based.

```java
// Accessing an element at row 0, column 1
int val = matrix[0][1]; // Returns 2 from the matrix above

// Modifying an element
matrix[2][2] = 99; // Changes the bottom-right element to 99
```

## 3. Traversing a 2D Array

The most common way to iterate through a 2D array is by using nested `for` loops.

### Using standard `for` loop:
```java
int rows = matrix.length;        // Number of rows
int cols = matrix[0].length;     // Number of columns in row 0

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println(); // Move to the next line after each row
}
```

### Using enhanced `for` loop:
```java
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

## 4. Jagged Arrays

In Java, since a 2D array is an array of arrays, each inner array can have a different length. These are called jagged (or ragged) arrays.

```java
int[][] jaggedArray = new int[3][];
jaggedArray[0] = new int[2]; // Row 0 has 2 columns
jaggedArray[1] = new int[4]; // Row 1 has 4 columns
jaggedArray[2] = new int[3]; // Row 2 has 3 columns
```

## 5. Applications of 2D Arrays

- **Matrices:** Mathematical matrix additions, multiplications, etc.
- **Grids/Boards:** Games like Chess, Tic-Tac-Toe, Sudoku, or grid-based pathfinding (mazes).
- **Tabular Data:** Storing spreadsheets or structured row/column form data.
- **Dynamic Programming:** DP state tables are often represented as 2D grids (e.g., Longest Common Subsequence, Knapsack Problem).