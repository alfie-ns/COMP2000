import java.util.Scanner;

public class q8 {
    
    // Method to classify the grade based on marks
    public static String classifyGrade(int marks) {
        if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the student's mark
        System.out.print("Enter the student's mark: ");
        int mark = scanner.nextInt();

        // Get the grade classification
        String grade = classifyGrade(mark);

        // Print the student's grade
        System.out.println("The student's grade is: " + grade);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}