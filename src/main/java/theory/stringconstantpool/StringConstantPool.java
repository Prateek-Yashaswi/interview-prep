package theory.stringconstantpool;

public class StringConstantPool {
    public static void main(String[] args) {
        String s1 = new String("PRATEEK");
        String s2 = new String("PRATEEK");

        String s3 = "PRATEEK";
        String s4 = "PRATEEK";

        System.out.println("Comparing it using ==");
        System.out.println(s1 == s2); // false
        System.out.println(s3 == s4); // true


        System.out.println("\nWhat happens when you compare it using .equals()");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s3.equals(s4)); // true
    }
}
