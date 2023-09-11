import java.util.Arrays;
import java.util.Collections;

/**
 * Написать процедуру для сортировки массива целых чисел в порядке убывания в декларативном стиле
 */

public class Declarative {
    public static void main(String[] args) {
        Integer [] numbers = {1, 17, 5, 11, 14, 25, 6, 8, 20};
        Arrays.sort(numbers);
        Collections.reverse(Arrays.asList(numbers));
        System.out.println(Arrays.toString(numbers));
    }
}

