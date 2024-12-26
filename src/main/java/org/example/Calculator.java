package org.example;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");
        System.out.println("Supported operations: +, -, *, /");
        System.out.println("Enter 'quit' to exit the program.");

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            try {
                String result = calculate(input);
                System.out.println("Output: " + result);
            } catch (Exception e) {
                System.out.println("Output: throws Exception");
            }
        }

        scanner.close();
    }

    public static String calculate(String input) throws Exception {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new Exception();
        }

        int a, b;
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new Exception();
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception();
        }

        String operator = parts[1];
        int result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new Exception();
                }
                result = a / b;
                break;
            default:
                throw new Exception();
        }

        return Integer.toString(result);
    }
}
