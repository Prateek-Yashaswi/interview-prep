package theory.stringArgs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("CONTAINS ARGS");
            Arrays.stream(args).forEach(System.out::println);
        } else {
            System.out.println("NO ARGS");
        }
    }
}
