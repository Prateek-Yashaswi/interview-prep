package theory.comparatorcomparable;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        var prateek = new Employee("Prateek", 1001, 25);
        var yashaswi = new Employee("Yashaswi", 1002, 25);

        System.out.println(prateek.compareTo(yashaswi));

        var employees = new TreeSet<>(Employee.NAME_COMPARATOR_ASC);
        employees.add(yashaswi);
        employees.add(prateek);

        System.out.println(employees);
    }
}
