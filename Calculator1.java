//Java Program to create a calculator and Return a Value from a Method.
//Explanation:We make a method named input which is used to get input from the user. We also make a method named
// add which is used to perform addition and return the result back to input method where we finally print the result.

import java.util.*;
public class Calculator1 {
    public static void main(String[] args) {
        int num1 = input("Enter the first number: ");
        int num2 = input("Enter the second number: ");

        int sum = add(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        }

        // Method to get input from the user
        public static int input(String message) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(message);
            return scanner.nextInt();
        }

        // Method to perform addition and return the result
        public static int add(int a, int b) {
            return a + b;
        }
    }
