import java.util.Comparator;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        var map = new TreeMap<Integer, String>(Comparator.reverseOrder());

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map);
    }
}
