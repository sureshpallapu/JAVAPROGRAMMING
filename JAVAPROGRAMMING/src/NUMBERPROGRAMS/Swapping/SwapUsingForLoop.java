package NUMBERPROGRAMS.Swapping;

import java.util.Scanner;

public class SwapUsingForLoop {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Increment a while decrementing b to swap values
        for (int i = 0; i < (b - a); i++) {
            a++;
            b--;
        }

        System.out.println("After Swapping without using temp variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

