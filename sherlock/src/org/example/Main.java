package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set variables:
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        // Ask for starting/ending numbers:
        System.out.print("Enter starting number: ");
        a = scanner.nextInt();
        System.out.print("Enter ending number: ");
        b = scanner.nextInt();

        // Call squares method, passing in the inputs, and print out the returned result:
        System.out.println("Total number of square integers: " + squares(a, b));
    }

    private static int squares(int a, int b) {
        // Use Math.ceil to consider numbers after starting number:
        int c = (int) Math.ceil(Math.sqrt(a));

        // Use Math.floor to consider numbers before ending number:
        int d = (int) Math.floor(Math.sqrt(b));

        // Subtract starting number from ending number.
        //  Add 1 due to Math.floor:
        int result = ((d-c) + 1);

        // Return the result:
        return result;
    }
}