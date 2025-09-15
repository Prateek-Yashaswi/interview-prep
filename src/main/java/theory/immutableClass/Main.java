package theory.immutableClass;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        var date = new Date();
        var exampleOne = new ExampleOne("Prateek", date);
        System.out.println(exampleOne.getDateOfJoining());

        date.setTime(0);
        System.out.println("After we modify the date, the original date inside our immutable class also gets modified");
        System.out.println(exampleOne.getDateOfJoining());

        System.out.println("-----------------------------");
        var dateTwo = new Date();
        var exampleTwo = new ExampleTwo("Prateek", dateTwo);

        System.out.println(exampleTwo.getDateOfJoining());

        dateTwo.setTime(0);
        System.out.println("If we return a defensive copy, the original date inside our immutable class remains unchanged");
        System.out.println(exampleTwo.getDateOfJoining());
    }
}
