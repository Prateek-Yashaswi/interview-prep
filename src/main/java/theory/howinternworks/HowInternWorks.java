package theory.howinternworks;

public class HowInternWorks {
    public static void main(String[] args) {
        String s1 = "TEST";
        String s2 = new String(s1);
        String s3 = s1.intern();

        System.out.println("COMPARING S1 & S2: " + (s1 == s2)); // false
        System.out.println("COMPARING S2 & S3: " + (s2 == s3)); // false
        System.out.println("COMPARING S1 & S3: " + (s1 == s3)); // true
    }
}
