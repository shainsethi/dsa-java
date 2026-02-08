# Sorting Algorithms 📊

**Sorting** is the process of arranging data in a particular order (ascending or descending). It is one of the most fundamental operations in computer science.

## Table of Contents
- [Bubble Sort](#bubble-sort)
- [Selection Sort](#selection-sort)
- [Insertion Sort](#insertion-sort)
- [Counting Sort](#counting-sort)
- [Built-in Sort](#built-in-sort)

---

## Bubble Sort

Bubble Sort works by repeatedly swapping adjacent elements if they are in the wrong order. Large elements "bubble up" to the end of the array.

### Algorithm
1. Loop from `0` to `n-2` (outer loop).
2. For each element, loop from `0` to `n-2-i` (inner loop).
3. Compare `arr[j]` and `arr[j+1]`.
4. If `arr[j] > arr[j+1]`, swap them.

> [!TIP]
> **Optimization**: If no elements are swapped during a pass, the array is already sorted, and we can stop early.

### Complexity
- **Time Complexity**: $O(n^2)$ (Average & Worst), $O(n)$ (Best case with optimization)
- **Space Complexity**: $O(1)$

- **Code**: [BubbleSort.java](./BubbleSort.java)

---

## Selection Sort

Selection Sort works by repeatedly finding the minimum element from the unsorted part and putting it at the beginning.

### Algorithm
1. Loop from `0` to `n-2` (outer loop).
2. Assume `arr[i]` is the minimum (`min = i`).
3. Loop from `i+1` to `n-1` (inner loop).
4. If `arr[j] < arr[min]`, update `min = j`.
5. Swap `arr[i]` and `arr[min]`.

### Complexity
- **Time Complexity**: $O(n^2)$ (Average, Worst, & Best)
- **Space Complexity**: $O(1)$

- **Code**: [SelectionSort.java](./SelectionSort.java)

---

## Insertion Sort

Insertion Sort works by taking an element from the unsorted part and placing it at its correct position in the sorted part.

### Algorithm
1. Loop from `1` to `n-1` (outer loop).
2. Store current element `curr = arr[i]` and `prev = i-1`.
3. While `prev >= 0` and `arr[prev] > curr`:
   - Shift `arr[prev]` to `arr[prev+1]`.
   - Decrement `prev`.
4. Place `curr` at `arr[prev+1]`.

### Complexity
- **Time Complexity**: $O(n^2)$ (Average & Worst), $O(n)$ (Best)
- **Space Complexity**: $O(1)$

- **Code**: [InsertionSort.java](./InsertionSort.java)

---

## Counting Sort

Counting Sort is a non-comparison-based sorting algorithm that works by counting the frequency of each element.

### Algorithm
1. Find the largest element (`range`) in the array.
2. Create a count array of size `range + 1`.
3. Count the frequency of each element in the original array.
4. Reconstruct the sorted array using the count array.

### Complexity
- **Time Complexity**: $O(n + range)$
- **Space Complexity**: $O(n + range)$

- **Code**: [CountingSort.java](./CountingSort.java)

---

## Built-in Sort

Java provides a built-in `Arrays.sort()` method to sort arrays efficiently.

### Algorithm
- Uses **Dual-Pivot Quicksort** for primitive types ($O(n \log n)$).
- Uses **TimSort** for objects ($O(n \log n)$).

### Usage
```java
// Ascending Order
Arrays.sort(arr);

// Sort Subarray (from index 0 to 3)
Arrays.sort(arr, 0, 3);

// Descending Order (requires Integer[] wrapper)
Arrays.sort(arr, Collections.reverseOrder());
```

- **Code**: [BuiltInSort.java](./BuiltInSort.java)
