package theory.comparableandcomparator;

public record Employee(String name, int age) implements Comparable<Employee> {
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        if (this.age == other.age) return 0;
        else if (this.age > other.age) return 1;
        else return -1;
    }
}
