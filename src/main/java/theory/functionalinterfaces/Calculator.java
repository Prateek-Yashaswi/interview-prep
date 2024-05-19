package theory.functionalinterfaces;

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);

    default void printResult(int result) {
        System.out.println("RESULT: " + result);
    }
}
