package theory.abstractclassesandinterfaces;

public abstract class MyAbstractClass {
    public abstract String getName();

    // Can contain concrete methods
    public String getAddress() {
        return "SOME ADDRESS FROM ABSTRACT CLASS";
    }

    // Can have static methods
    static Integer getHouse() {
        return 1;
    }
}
