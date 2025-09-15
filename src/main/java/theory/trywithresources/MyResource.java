package theory.trywithresources;

// Create your own resource by implementing AutoCloseable
public class MyResource implements AutoCloseable {

    public void greet() {
        System.out.println("Hello World");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing MyResource");
    }
}
