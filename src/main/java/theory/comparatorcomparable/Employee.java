package theory.comparatorcomparable;

import java.util.Comparator;
import java.util.Objects;

class Employee implements Comparable<Employee> {

    private final String name;
    private final int salary;
    private final int age;

    public static final Comparator<Employee> SALARY_COMPARATOR = Comparator.comparingInt(Employee::getSalary);
    public static final Comparator<Employee> SALARY_COMPARATOR_REVERSE = Comparator.comparingInt(Employee::getSalary).reversed();

    public static final Comparator<Employee> NAME_COMPARATOR_ASC = (e1, e2) -> {
        if (e1.name.equalsIgnoreCase(e2.name)) return 0;
        return e1.name.compareTo(e2.name);
    };

    public static final Comparator<Employee> NAME_COMPARATOR_DESC = new Comparator<Employee>() {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            if (employee1.name.equalsIgnoreCase(employee2.name)) return 0;
            return employee1.name.compareTo(employee2.name) * -1;
        }
    };

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public int compareTo(Employee employee) {
        if (this.salary > employee.salary) return 1;
        else if (this.salary < employee.salary) return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;
        return this.salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    private int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
