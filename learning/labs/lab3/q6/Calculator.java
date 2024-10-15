package learning.labs.lab3.q6;

// Rename the class to avoid conflict
public class Calculator {

    // Method to add two numbers
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }
}