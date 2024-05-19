package theory.comparableandcomparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("PRATEEK", 24, 5000);
        Employee e2 = new Employee("PRATEEK", 12, 1000);
        Employee e3 = new Employee("PRATEEK", 24, 10000);

        System.out.println("COMPARABLE: Comparing Ages");
        System.out.println(e1.compareTo(e2)); // 1
        System.out.println(e1.compareTo(e3)); // 0
        System.out.println(e2.compareTo(e1)); // -1


        System.out.println("\nCOMPARATOR: Based on salary (Ascending Order)");
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        // Sorting based on the implemented comparator (salary)
        employees.sort(new EmployeeComparator());
        System.out.println(employees);

    }
}
