package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result = 0.0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } 
                    else
                    {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }

            System.out.println("Result: " + result);
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        finally 
        {
            scanner.close();
        }
    }
}

