package theory.trywithresources;

public class ExampleOne {

    public static void main(String[] args) {

        try (var myResource = new MyResource()) {
            myResource.greet();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
