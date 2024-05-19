package theory.functionalinterfaces;

public class AddTwoNumbers implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
