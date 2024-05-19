package theory.functionalinterfaces;

public class Main {
    public static void main(String[] args) {
        Calculator add = new AddTwoNumbers();

        int res1 = add.calculate(1,2);
        add.printResult(res1);

        Calculator multiply = new MultiplyTwoNumbers();
        int res2 = multiply.calculate(5,10);
        multiply.printResult(res2);
    }
}
