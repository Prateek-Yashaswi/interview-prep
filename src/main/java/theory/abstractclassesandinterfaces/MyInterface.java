package theory.abstractclassesandinterfaces;

public interface MyInterface {
    String getName();

    // Can Have default methods
    default String getAddress() {
        return "ADDRESS FROM INTERFACE";
    }

    // Can have static methods
    static Integer getHouse() {
        return 2;
    }
}
