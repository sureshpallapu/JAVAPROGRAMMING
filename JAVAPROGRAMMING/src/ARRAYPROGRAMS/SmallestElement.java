package ARRAYPROGRAMS;


// Find the Smallest Element in an Array
public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 25};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Smallest element: " + min);
    }
}

