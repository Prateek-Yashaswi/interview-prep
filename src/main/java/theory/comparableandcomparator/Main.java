package theory.comparableandcomparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("PRATEEK", 24);
        Employee e2 = new Employee("PRATEEK", 12);
        Employee e3 = new Employee("PRATEEK", 24);

        System.out.println("COMPARABLE");
        System.out.println(e1.compareTo(e2)); // 1
        System.out.println(e1.compareTo(e3)); // 0
        System.out.println(e2.compareTo(e1)); // -1


        System.out.println("\nCOMPARATOR");
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        // Sorting based on the implemented comparator (age)
        employees.sort(new EmployeeComparator());
        System.out.println(employees);

    }
}
