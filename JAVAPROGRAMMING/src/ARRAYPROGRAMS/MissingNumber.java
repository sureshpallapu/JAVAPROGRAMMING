package ARRAYPROGRAMS;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing 3
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;

        for (int num : arr) {
            sum -= num;
        }

        System.out.println("Missing number: " + sum);
    }
}

