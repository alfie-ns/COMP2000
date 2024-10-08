import java.util.ArrayList;
import java.util.List;

public class q2 {
    public static void main(String[] args) {
        String[] EmployeeName = {"John", "Robert", "Sam", "Chris", "Alice", "Jane"};
        Integer[] EmployeeAge = {25, 30, 35, 40, 45, 64};

        // Use a List to store names of employees over 50
        List<String> EmployeeOver50 = new ArrayList<>();

        for (int i = 0; i < EmployeeName.length; i++) {
            System.out.println("Employee Name: " + EmployeeName[i] + " Employee Age: " + EmployeeAge[i]);

            // Check if age is over 50 and add the name to the list
            if (EmployeeAge[i] > 50) {
                EmployeeOver50.add(EmployeeName[i]);
            }
        }

        // Print the list of employee names over 50 (if any)
        System.out.println("Employees over 50: " + EmployeeOver50);
    }
}