package q3;

// Abstract Employee class
abstract class Employee {
    public abstract void job();
    public abstract void workEnvironment();
    public abstract void skills();
}

// Lecturer class extending Employee
class Lecturer extends Employee {
    @Override
    public void job() {
        System.out.println("Lecturer's job: Teaching and research");
    }

    @Override
    public void workEnvironment() {
        System.out.println("Lecturer's work environment: University campus and lecture halls");
    }

    @Override
    public void skills() {
        System.out.println("Lecturer's skills: Subject expertise, public speaking, research");
    }
}

// Engineer class extending Employee
class Engineer extends Employee {
    @Override
    public void job() {
        System.out.println("Engineer's job: Designing and building solutions");
    }

    @Override
    public void workEnvironment() {
        System.out.println("Engineer's work environment: Office, lab, or field sites");
    }

    @Override
    public void skills() {
        System.out.println("Engineer's skills: Problem-solving, technical knowledge, project management");
    }
}

// Main class to demonstrate the implementation
public class EmployeeHierarchyDemo {
    public static void main(String[] args) {
        Employee lecturer = new Lecturer();
        Employee engineer = new Engineer();

        System.out.println("Lecturer Information:");
        lecturer.job();
        lecturer.workEnvironment();
        lecturer.skills();

        System.out.println("\nEngineer Information:");
        engineer.job();
        engineer.workEnvironment();
        engineer.skills();
    }
}