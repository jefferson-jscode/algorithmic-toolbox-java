import java.util.List;
import java.util.ArrayList;

public class FibonacciSequence {
    public static int fibonacciNumber(int position) {
        if (position == 0) return 0;
        if (position == 1) return 1;

        return fibonacciNumber(position - 1) + fibonacciNumber(position - 2);
    }

    public static List<Integer> fibonacciSequence(int position) {
        List<Integer> sequence = new ArrayList<>();

        for (int i = 0; i <= position; i++) {
            sequence.add(fibonacciNumber(i));
        }

        return sequence;
    }

    public static void main(String... args) {
        System.out.println("0: " + fibonacciNumber(0));
        System.out.println("1: " + fibonacciNumber(1));
        System.out.println("2: " + fibonacciNumber(2));
        System.out.println("5: " + fibonacciNumber(5));
        System.out.println("8: " + fibonacciNumber(8));
        System.out.println("10: " + fibonacciNumber(10));

        System.out.println("0: " + fibonacciSequence(0));
        System.out.println("1: " + fibonacciSequence(1));
        System.out.println("2: " + fibonacciSequence(2));
        System.out.println("5: " + fibonacciSequence(5));
        System.out.println("8: " + fibonacciSequence(8));
        System.out.println("10: " + fibonacciSequence(10));
    }
}
