package theory.immutableClass;

import java.util.Date;

public final class ExampleTwo {

    private final String name;
    private final Date dateOfJoining;

    public ExampleTwo(String name, Date dateOfJoining) {
        this.name = name;
        this.dateOfJoining = new Date(dateOfJoining.getTime());
    }

    public String getName() {
        return name;
    }

    // Return a defensive copy that can't be modified
    public Date getDateOfJoining() {
        return new Date(dateOfJoining.getTime());
    }
}
