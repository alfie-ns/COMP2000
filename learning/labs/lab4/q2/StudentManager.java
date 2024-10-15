package q2;


import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int mark;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter student mark: ");
        this.mark = scanner.nextInt();
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students (5-10): ");
        int numStudents = scanner.nextInt();

        while (numStudents < 5 || numStudents > 10) {
            System.out.print("Please enter a number between 5 and 10: ");
            numStudents = scanner.nextInt();
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            Student student = new Student();
            student.input();
            students.add(student);
        }

        System.out.println("\nStudents who passed (mark 40 or more):");
        for (Student student : students) {
            if (student.getMark() >= 40) {
                System.out.println(student.getName());
            }
        }

        scanner.close();
    }
}