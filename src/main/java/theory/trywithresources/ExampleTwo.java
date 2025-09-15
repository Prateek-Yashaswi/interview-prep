package theory.trywithresources;

public class ExampleTwo {

    public static void main(String[] args) {

        try (var myResource = new MyResource()) {
            throw new Exception("Simulation");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
