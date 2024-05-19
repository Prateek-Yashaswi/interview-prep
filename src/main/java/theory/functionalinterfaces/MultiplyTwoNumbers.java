package theory.functionalinterfaces;

public class MultiplyTwoNumbers implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
