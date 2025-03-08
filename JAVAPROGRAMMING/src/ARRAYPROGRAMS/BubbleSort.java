package ARRAYPROGRAMS;

public class BubbleSort {
	// Bubble Sort Function
	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			// Inner loop for comparisons
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// Function to print the array
	static void printArray(int arr[]) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Unsorted Array:");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("Sorted Array:");
		printArray(arr);
	}
}
