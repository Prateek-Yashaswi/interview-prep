package theory.immutableClass;

import java.util.Date;

public final class ExampleOne {

    private final String name;

    // This is an incorrect way of defining a mutable field in your immutable class
    private final Date dateOfJoining;

    public ExampleOne(String name, Date dateOfJoining) {
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    // This is an incorrect way of handling a getter for a mutable field in your immutable class
    public Date getDateOfJoining() {
        return dateOfJoining;
    }
}
