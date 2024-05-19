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

    // Can have main() starting from Java 8 but not in the older versions
    static void main(String[] args) {
        System.out.println("MAIN METHOD FROM INTERFACE");
    }
}
