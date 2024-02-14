import java.util.ArrayList;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> even = new ArrayList<>(numbers.length);
        for (int i : numbers) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }

        even.forEach(System.out::println);
    }
}
