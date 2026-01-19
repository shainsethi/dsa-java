# Sorting Algorithms 📊

**Sorting** is the process of arranging data in a particular order (ascending or descending). It is one of the most fundamental operations in computer science.

## Table of Contents
- [Bubble Sort](#bubble-sort)
- [Selection Sort](#selection-sort)
- [Insertion Sort](#insertion-sort)
- [Counting Sort](#counting-sort)

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

*(Coming soon...)*

---

## Insertion Sort

Insertion Sort works by taking an element from the unsorted part and placing it at its correct position in the sorted part.

*(Coming soon...)*

---

## Counting Sort

Counting Sort is a non-comparison-based sorting algorithm that works by counting the frequency of each element.

*(Coming soon...)*
