package ARRAYPROGRAMS;

import java.util.Arrays;

public class SelectionSort {
    // Function to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  // Assume the first element is the minimum
            
            // Find the index of the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
