package streams;

import streams.model.Employee;
import streams.model.Transaction;

import java.time.Month;
import java.time.Year;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        var strings = List.of("abc", "pqr", "abs", "  ", "prat", "anki", "prateek");
        var nums = List.of(1, 2, 3, 4, 5, 6, 1, 2, 2, 6, 6, 6, 6);
        var employee1 = new Employee("Prateek", 25, 1000.0, "HR");
        var employee2 = new Employee("Yashaswi", 30, 500.0, "IT");
        var employee3 = new Employee("Prateek2", 35, 800.0, "HR");
        var employee4 = new Employee("Yashaswi2", 45, 8100.0, "CEO");
        var employees = List.of(employee1, employee2, employee3, employee4);
        var sentences = List.of("hello world", "hello java", "java stream world");
        var transaction1 = new Transaction(Year.of(2024), Month.JANUARY);
        var transaction2 = new Transaction(Year.of(2024), Month.FEBRUARY);
        var transaction3 = new Transaction(Year.of(2025), Month.JANUARY);

        var transactions = List.of(transaction1, transaction2, transaction3);


        var uppercase = Easy.toUppercase(strings);
        System.out.println("Uppercase: " + uppercase);

        var evens = Easy.filterEven(nums);
        System.out.println("Evens: " + evens);

        var startsWithA = Easy.startsWith(strings, 'a');
        System.out.println("Starts With a: " + startsWithA);

        var ascending = Easy.sort(nums, 1);
        var descending = Easy.sort(nums, -1);
        System.out.println("Ascending: " + ascending);
        System.out.println("Descending: " + descending);

        var distinct = Easy.removeDuplicates(nums);
        System.out.println("Distinct: " + distinct);

        var min = Easy.findExtremes(nums, -1);
        var max = Easy.findExtremes(nums, 1);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        var parsed = Easy.parseWithDelimiter(strings, '|');
        System.out.println("Separated by '|': " + parsed);

        var sum = Easy.sumAll(nums);
        System.out.println("Sum: " + sum);

        var firstStartsWithA = Easy.firstOccurrence(strings, 'a');
        System.out.println("First element to start with 'a': " + firstStartsWithA);

        var nonEmpty = Easy.nonEmpty(strings);
        System.out.println("Non Empty Items: " + nonEmpty);

        var groupedByLen = Medium.groupByLength(strings);
        System.out.println("Grouped By Length: " + groupedByLen);

        var sortedEmployeeByAgeAsc = Medium.sortByAge(employees, 1);
        var sortedEmployeeByAgeDesc = Medium.sortByAge(employees, -1);
        System.out.println("Employees sorted by age ascending: " + sortedEmployeeByAgeAsc);
        System.out.println("Employees sorted by age descending: " + sortedEmployeeByAgeDesc);

        var sortedEmployeeBySalaryAsc = Medium.sortBySalary(employees, 1);
        var sortedEmployeeBySalaryDesc = Medium.sortBySalary(employees, -1);
        System.out.println("Employees sorted by salary ascending: " + sortedEmployeeBySalaryAsc);
        System.out.println("Employees sorted by salary descending: " + sortedEmployeeBySalaryDesc);

        var partitionedByOddEven = Medium.partitionByOddEven(nums);
        System.out.println("Distinct partitioned by odd/even: " + partitionedByOddEven);

        var employeesNameWhoseAgeIsMoreThan = Medium.extractEmployeeNamesWithAgeMoreThan(employees, 25);
        System.out.println("Employees Name Whose age is more than 25: " + employeesNameWhoseAgeIsMoreThan);

        var frequencyOfEachWord = Medium.countFreqOfWords(sentences);
        System.out.println("Frequency of each word: " + frequencyOfEachWord + " in " + sentences);

        var secondHighest = Medium.secondHighest(nums);
        System.out.println("Second highest: " + secondHighest);

        var nameAndSalary = Medium.extractNameAndSalary(employees);
        System.out.println("Name and salary: " + nameAndSalary);

        var longestString = Medium.longestString(strings);
        System.out.println("Longest string: " + longestString);

        var groupedByYearAndMonth = Hard.groupByYearAndMonth(transactions);
        System.out.println("Transactions grouped by year and month: " + groupedByYearAndMonth);

        var countEmployeeInDept = Hard.countEmployeeInDepartment(employees);
        System.out.println("Count of employees in each department: " + countEmployeeInDept);

        var topThreePaidEmployees = Hard.topThreePaidEmployees(employees);
        System.out.println("Top 3 highest paid employees: " + topThreePaidEmployees);

        var sortedNamesGroupedByDept = Hard.departmentToListOfEmpNamesSorted(employees);
        System.out.println("Sorted names grouped by dept: " + sortedNamesGroupedByDept);

        var top100Numbers = IntStream.rangeClosed(1, 100).boxed().toList();
        var pageSize = 20;
        var page = 3;
        var paginatedNumbers = Hard.paginatedResponse(top100Numbers, pageSize, page);
        System.out.println("Paginated response: " + paginatedNumbers);

        var mostFreqEle = Hard.mostFrequentEle(nums);
        System.out.println("Most frequent element: " + mostFreqEle);
    }
}
