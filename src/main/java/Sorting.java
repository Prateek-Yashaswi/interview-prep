import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Sorting {

    public static void main(String[] args) {

        var random = new Random();
        var size = 10;

        var arr = IntStream.rangeClosed(1, size).map(item -> random.nextInt(0, size)).toArray();

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        bubbleSort(arr);
        selectionSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        var start = LocalDateTime.now();
        boolean swapped = true;
        var len = arr.length;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            len--;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Bubble Sort Completed in " + Duration.between(start, LocalDateTime.now()).toMillis() + "ms");
    }

    private static void selectionSort(int[] arr) {
        var start = LocalDateTime.now();

        for (int i = 0; i < arr.length - 1; i++) {
            var selectedIndex = i;

            for (var j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[selectedIndex]) {
                    selectedIndex = j;
                }
            }

            var temp = arr[i];
            arr[i] = arr[selectedIndex];
            arr[selectedIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Selection Sort Completed in " + Duration.between(start, LocalDateTime.now()).toMillis() + "ms");
    }
}
