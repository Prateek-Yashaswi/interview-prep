package streams;

import streams.model.Employee;
import streams.model.Transaction;

import java.time.Month;
import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hard {

    private Hard() {
        // To make it a utility class
    }

    // Given a list of Transaction objects, group them by year and then by month.
    public static Map<Year, Map<Month, List<Transaction>>> groupByYearAndMonth(List<Transaction> transactions) {
        return transactions.stream().collect(Collectors.groupingBy(Transaction::getYear, Collectors.groupingBy(Transaction::getMonth)));
    }

    public static Map<String, Long> countEmployeeInDepartment(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
    }

    public static List<Employee> topThreePaidEmployees(List<Employee> employees) {
        return employees.stream().sorted((a,b) -> Double.compare(b.salary(), a.salary())).limit(3).toList();
    }

    public static Map<String, List<String>> departmentToListOfEmpNamesSorted(List<Employee> employees) {
         return employees.stream().collect(Collectors.groupingBy(Employee::department,
                 Collectors.mapping(
                         Employee::name,
                         Collectors.collectingAndThen(
                                 Collectors.toList(),
                                 list -> list.stream().sorted().toList()
                         ))));
    }

    public static List<Integer> paginatedResponse(List<Integer> items, long pageSize, long page) {
        return items.stream().skip(page * pageSize).limit(pageSize).toList();
    }

    public static Integer mostFrequentEle(List<Integer> nums) {
        return nums.stream().collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
