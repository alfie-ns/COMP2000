package learning.labs.lab4.q6;

// Main.java
import java.util.Scanner;
import learning.labs.lab3.q6.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the first number (x): ");
        double x = sc.nextDouble();
        
        System.out.print("Enter the second number (y): ");
        double y = sc.nextDouble();
        
        // Creating an instance of the Calculator class
        Calculator calculator = new Calculator();
        
        // Calling the add and divide methods
        double sum = calculator.add(x, y);
        double quotient = calculator.divide(x, y);
        
        // Outputting the results
        System.out.println("Sum: " + sum);
        System.out.println("Quotient: " + quotient);
        
        sc.close();
    }
}