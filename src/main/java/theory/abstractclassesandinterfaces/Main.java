package theory.abstractclassesandinterfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("ABSTRACT CLASS");
        MyAbstractClass a = new ClassA();

        System.out.println(a.getAddress());
        System.out.println(a.getName());
        System.out.println(MyAbstractClass.getHouse());

        System.out.println("\nINTERFACE");
        MyInterface i = new ClassI();
        System.out.println(i.getName());
        System.out.println(i.getAddress());
        System.out.println(MyInterface.getHouse());
    }
}
